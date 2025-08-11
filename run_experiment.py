import os
import time
import uuid
from config import Config
from database import init_db, add_experiment_result
from generator.geminiGenerator import GeminiGenerator
from generator.deepseekGenerator import DeepSeekGenerator
from generator.codellama_generator import CodeLlamaGenerator
from generator.randoop_generator import RandoopGenerator
from generator.evosuite_generator import EvoSuiteGenerator
from evaluation.effectiveness import analyze_effectiveness, check_compilation, analyze_humaneval_effectiveness
from evaluation.maintainability import analyze_maintainability
from utils import load_prompt_template, load_scenario, remove_markdown_and_backticks, postprocess_java_test, combine_humaneval_java_code
from static_analyzer import analyze_java_file


GENERATOR_REGISTRY = {
    'Google Gemini': {'class': GeminiGenerator, 'required_keys': ['GOOGLE_API_KEY'], 'type': 'llm'},
    'Groq Llama': {'class': CodeLlamaGenerator, 'required_keys': ['GROQ_API_KEY'], 'type': 'llm'},
    'DeepSeek': {'class': DeepSeekGenerator, 'required_keys': ['DEEPSEEK_API_KEY'], 'type': 'llm'},
    'Randoop': {'class': RandoopGenerator, 'required_keys': ['RANDOOP_JAR_PATH'], 'type': 'traditional'}
}

def setupExperiment(generator_name, model_name, prompt_strategy, scenario_name, benchmark_name):
    exp_id_name = model_name or generator_name.replace(' ', '-')
    experiment_id = f"{exp_id_name}_{scenario_name}_{prompt_strategy or 'default'}_{uuid.uuid4().hex[:8]}"
    print(f"\n--- Starting Experiment: {experiment_id} ---")

    config = {
        "PMD_PATH": "/Users/gagan/tools/pmd-bin-7.15.0",
        "RULESET_PATH": "rulesets/maintainability_rules.xml"
    }
    
    if generator_name not in GENERATOR_REGISTRY:
        raise ValueError(f"Unknown generator: {generator_name}")
    
    gen_info = GENERATOR_REGISTRY[generator_name]
    for key in gen_info['required_keys']:
        value = getattr(Config, key, None)
        if not value:
            raise ValueError(f"Required config key '{key}' is missing from .env or config.py.")
        config[key] = value

    benchmark_dir_full_path = os.path.join(Config.BENCHMARK_DIR, benchmark_name)
    config['BENCHMARK_DIR'] = benchmark_dir_full_path
    
    generator = gen_info['class'](config=config)
    scenario = load_scenario(scenario_name, benchmark_name)
    
    experiment_artifacts_dir = os.path.join('outputs', experiment_id)
    os.makedirs(experiment_artifacts_dir, exist_ok=True)
    
    return experiment_id, config, generator, scenario, benchmark_dir_full_path, experiment_artifacts_dir

def get_final_class_name(generator_name, experiment_id):
    if generator_name == 'Randoop':
        return "RegressionTest0"
    elif generator_name == 'EvoSuite':
        return "GeneratedEvoSuiteTest" 
    else:
        sanitized_id = experiment_id.replace('-', '_')
        return f"GeneratedTest_{sanitized_id}"

def _log_experiment_failure(experiment_id, generator_name, model_name, benchmark_name, time_cost):
    """Logs a failed experiment run to the database."""
    failure_results = {
        'experiment_id': experiment_id,
        'generator_name': f"{generator_name} ({model_name or 'N/A'})",
        'prompt_strategy': 'N/A',
        'benchmark_name': benchmark_name,
        'time_cost': time_cost,
        'token_cost': 0, 'compiles': False,
        'runs_successfully': False, 'line_coverage': 0.0,
        'branch_coverage': 0.0, 'cyclomatic_complexity': None,
        'coupling_between_objects': None
    }
    add_experiment_result(failure_results)
    print(f"--- Failure for experiment {experiment_id} has been logged. ---")

def _run_llm_generation(generator, scenario, prompt_strategy, model_name, experiment_id, benchmark_dir_full_path, experiment_artifacts_dir):
    """Handles the LLM generation and self-correction loop."""
    target_file_path = os.path.join(benchmark_dir_full_path, scenario['files'][0])
    analysis_results = analyze_java_file(target_file_path)
    if not analysis_results:
        raise ValueError("Static analysis failed.")

    final_class_name = get_final_class_name('llm', experiment_id)
    test_package = scenario['test_destination'].replace('src/test/java/', '').replace('/', '.')
    
    scaffold_parts = [
        f"package {test_package};\n",
        "\n".join(analysis_results['imports']),
        "import org.junit.jupiter.api.Test;",
        "import org.junit.jupiter.api.extension.ExtendWith;",
        "import org.mockito.InjectMocks;",
        "import org.mockito.Mock;",
        "import org.mockito.junit.jupiter.MockitoExtension;",
        "import static org.junit.jupiter.api.Assertions.*;",
        "import static org.mockito.ArgumentMatchers.*;",
        "import static org.mockito.Mockito.*;",
        "import static org.mockito.BDDMockito.*;"
    ]
    code_scaffold = "\n".join(scaffold_parts)


    max_retries = 2
    cleaned_code = ""
    time_cost = 0.0
    
    for attempt in range(max_retries):
        print(f"\n--- LLM Generation Attempt {attempt + 1}/{max_retries} ---")
        
        prompt_template_name = 'repair' if attempt > 0 else prompt_strategy
        prompt_template = load_prompt_template(prompt_template_name)
        
        if attempt == 0:
            target_file_path = os.path.join(benchmark_dir_full_path, scenario['files'][0])
            with open(target_file_path, 'r', encoding='utf-8') as f:
                code_context = f.read()
            
            prompt = prompt_template.format(
                code_context=code_context,
                code_scaffold=code_scaffold, 
                class_name=final_class_name
            )
        else:
            prompt = prompt_template.format(broken_code=cleaned_code, error_message=build_log)

        start_time = time.time()
        raw_code = generator.generate(prompt, prompt_strategy, model_name)
        time_cost += time.time() - start_time
        
        if not raw_code or "Error:" in raw_code:
            print(f"Generator returned an error or empty code: {raw_code}")
            continue

        cleaned_code = postprocess_java_test(raw_code, code_context)
        test_destination = os.path.join(benchmark_dir_full_path, scenario['test_destination'])
        compiles, build_log = check_compilation(cleaned_code, final_class_name, benchmark_dir_full_path, test_destination)

        if compiles:
            print("Code compiled successfully!")
            return cleaned_code, time_cost
        else:
            log_path = os.path.join(experiment_artifacts_dir, f"build_failure_log_attempt_{attempt + 1}.txt")
            with open(log_path, 'w', encoding='utf-8') as f:
                f.write(build_log)
            failed_test_path = os.path.join(experiment_artifacts_dir, f"FailedTest_attempt_{attempt + 1}.java")
            with open(failed_test_path, 'w', encoding='utf-8') as f:
                f.write(cleaned_code)
            print("Compilation failed. Logs and failed test saved.")
            
    return None, time_cost

def run_humaneval_generation(generator, scenario, prompt_strategy, model_name, experiment_id, experiment_artifacts_dir):
    print(f"\n--- Running HumanEval Generation ---")
    method_signature = scenario['prompt']
    method_body = scenario['canonical_solution']
    full_method = f"{method_signature.rstrip()[:-1]}\n{method_body}"
    
    code_context = full_method
    print("code_context", code_context)
    
    prompt_template = load_prompt_template(prompt_strategy)
    final_class_name = get_final_class_name('llm', experiment_id)
    
    prompt = prompt_template.format(
        code_context=code_context,
        class_name=final_class_name
    )
    
    raw_code, time_cost, token_cost = generator.generate(prompt, prompt_strategy, model_name)
    
    if not raw_code or "Error:" in raw_code:
        print(f"Generator returned an error or empty code: {raw_code}")
        return None, time_cost
    
    return raw_code, time_cost, token_cost

def _run_traditional_generation(generator, scenario, benchmark_dir_full_path):
    """Handles test generation using traditional tools like EvoSuite or Randoop."""
    print(f"\n--- Running Traditional Generator: {generator.__class__.__name__} ---")
    class_file_path = scenario['files'][0]
    code_context = class_file_path.replace('src/main/java/', '').replace('.java', '').replace('/', '.')
    
    start_time = time.time()
    generated_code = generator.generate(code_context)
    time_cost = time.time() - start_time
    
    return generated_code, time_cost

def finalize_and_log_results(experiment_id, generated_code, final_class_name, generator_name, model_name, prompt_strategy, benchmark_name, time_cost, token_cost, experiment_artifacts_dir, config, scenario=None):
    
    if benchmark_name == "humaneval":
        cleaned_code = remove_markdown_and_backticks(generated_code)
        combined_code = combine_humaneval_java_code(scenario, cleaned_code)     
        solution_path = os.path.join(experiment_artifacts_dir, f"{final_class_name}.java")
        with open(solution_path, 'w', encoding='utf-8') as f:
            f.write(combined_code)
        
        print("\nAnalyzing HumanEval effectiveness...")
        effectiveness_results = analyze_humaneval_effectiveness(solution_path, experiment_artifacts_dir, final_class_name)

        print("Analyzing HumanEval maintainability...")
        maintainability_results = analyze_maintainability(solution_path, config['PMD_PATH'], config['RULESET_PATH'])
        
    else:
        actual_test_path = os.path.join(experiment_artifacts_dir, f"{final_class_name}.java")
        with open(actual_test_path, 'w', encoding='utf-8') as f:
            f.write(generated_code)

        print("\nAnalyzing final effectiveness...")
        effectiveness_results = analyze_effectiveness(actual_test_path, config['BENCHMARK_DIR'], experiment_artifacts_dir)
        
        print("Analyzing final maintainability...")
        maintainability_results = analyze_maintainability(actual_test_path, config['PMD_PATH'], config['RULESET_PATH'])
    
    final_results = {
        'experiment_id': experiment_id,
        'generator_name': f"{generator_name} ({model_name or 'N/A'})",
        'prompt_strategy': prompt_strategy if GENERATOR_REGISTRY[generator_name]['type'] == 'llm' else 'N/A',
        'benchmark_name': benchmark_name,
        'time_cost': time_cost,
        'token_cost': token_cost,
        **effectiveness_results,
        **maintainability_results
    }
    
    add_experiment_result(final_results)
    print(f"--- Experiment {experiment_id} Finished and Saved ---")

def run_experiment(generator_name, model_name, prompt_strategy, benchmark_name, scenario_name):
    try:
        experiment_id, config, generator, scenario, benchmark_dir_full_path, experiment_artifacts_dir = setupExperiment(
            generator_name, model_name, prompt_strategy, scenario_name, benchmark_name
        )
    except (ValueError, FileNotFoundError) as e:
        print(f"Experiment setup failed: {e}")
        return

    gen_info = GENERATOR_REGISTRY[generator_name]
    generated_code = None
    time_cost = 0.0

    try:
        if benchmark_name == "humaneval" and gen_info['type'] == 'llm':
            generated_code, time_cost, token_cost = run_humaneval_generation(
                generator, scenario, prompt_strategy, model_name, experiment_id, experiment_artifacts_dir
            )
        elif gen_info['type'] == 'llm':
            generated_code, time_cost = _run_llm_generation(
                generator, scenario, prompt_strategy, model_name, experiment_id, benchmark_dir_full_path, experiment_artifacts_dir
            )
        else:
            generated_code, time_cost = _run_traditional_generation(
                generator, scenario, benchmark_dir_full_path
            )
    except Exception as e:
        print(f"An unexpected error occurred during generation: {e}")
        _log_experiment_failure(experiment_id, generator_name, model_name, benchmark_name, time_cost)
        return

    if not generated_code or "Error:" in generated_code:
        print(f"Generator failed to produce valid code. Raw output: {generated_code}")
        if gen_info['type'] == 'traditional':
            _log_experiment_failure(experiment_id, generator_name, model_name, benchmark_name, time_cost)
        return
        
    final_class_name = get_final_class_name(generator_name, experiment_id)
    
    finalize_and_log_results(
        experiment_id, generated_code, final_class_name, generator_name, model_name, 
        prompt_strategy, benchmark_name, time_cost, token_cost, experiment_artifacts_dir, config, scenario
    )

if __name__ == "__main__":
    init_db()
    pass 