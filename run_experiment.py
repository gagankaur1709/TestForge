import os
import time
import uuid
from config import Config
from database import init_db, add_experiment_result
from generator.geminiGenerator import GeminiGenerator
from generator.deepseekGenerator import DeepSeekGenerator
from generator.codellama_generator import CodeLlamaGenerator
from evaluation.effectiveness import analyze_effectiveness, check_compilation
from evaluation.maintainability import analyze_maintainability
from utils import load_prompt_template, format_prompt, load_scenario, load_code_context, postprocess_java_test_v2

GENERATOR_REGISTRY = {
    'Gemini-Pro': {
        'class': GeminiGenerator,
        'required_keys': ['GOOGLE_API_KEY']
    },
    'CodeLlama-70b': {
        'class': CodeLlamaGenerator,
        'required_keys': ['GROQ_API_KEY']
    },
    'DeepSeek': {
        'class': DeepSeekGenerator,
        'required_keys': ['DEEPSEEK_API_KEY']
    },
}

def run_experiment(generator_name, model_name, prompt_strategy, benchmark_name):
    """
    Orchestrates a single, complete experiment run, now with a self-correction loop.
    """
    experiment_id = f"{model_name}_{prompt_strategy}_{uuid.uuid4().hex[:8]}"
    print(f"\n--- Starting Experiment: {experiment_id} ---")

    experiment_artifacts_dir = os.path.join('outputs', experiment_id)
    os.makedirs(experiment_artifacts_dir, exist_ok=True)

    config = { "PMD_PATH": "/Users/gagan/tools/pmd-bin-7.15.0", 
    "RULESET_PATH": "rulesets/maintainability_rules.xml" }


    if generator_name not in GENERATOR_REGISTRY: raise ValueError(f"Unknown generator: {generator_name}")
    gen_info = GENERATOR_REGISTRY[generator_name]
    for key in gen_info['required_keys']:
        value = getattr(Config, key, None)
        if not value: raise ValueError(f"Required config key '{key}' is missing.")
        config[key] = value
    
    benchmark_dir_full_path = os.path.join(Config.BENCHMARK_DIR, benchmark_name)
    generator = gen_info['class'](config=config)

    try:
        scenario = load_scenario('sql_integration_owners') # Example scenario
        code_context_data = load_code_context(benchmark_dir_full_path, scenario)
        prompt_template = load_prompt_template(prompt_strategy, scenario)
        formatted_prompt = format_prompt(prompt_template, code_context_data)
    except Exception as e:
        print(f"Failed to load scenario or prompt: {e}")
        return

    generated_code = None
    max_retries = 3
    
    for attempt in range(max_retries):
        print(f"\n--- Generation Attempt {attempt + 1}/{max_retries} ---")
        
        if attempt == 0:
            start_time = time.time()
            current_code = generator.generate(prompt=formatted_prompt, context=code_context_data, model_name=model_name)
            time_cost = time.time() - start_time
        else:
            repair_prompt_template = load_prompt_template('repair', scenario)
            formatted_repair_prompt = repair_prompt_template.format(
                broken_code=current_code,
                error_message=build_log
            )
            
            current_code = generator.generate(prompt=formatted_repair_prompt, context=None, model_name=model_name)

        if "Error:" in current_code:
            print(f"Generator returned an error: {current_code}")
            continue 

        compiles, build_log = check_compilation(current_code, "GeneratedTest", benchmark_dir_full_path)

        if compiles:
            print("Code compiled successfully!")
            generated_code = current_code
            break 
        else:
            log_filename = f"build_failure_log_attempt_{attempt + 1}.txt"
            log_filepath = os.path.join(experiment_artifacts_dir, log_filename)
            
            with open(log_filepath, 'w', encoding='utf-8') as f:
                f.write(build_log)
            
            print(f"Compilation failed. Full log saved to: {log_filepath}")
    
    if generated_code is None:
        print("Failed to generate compilable code after all attempts. Ending experiment.")
        return

    experiment_artifacts_dir = os.path.join('outputs', experiment_id)
    os.makedirs(experiment_artifacts_dir, exist_ok=True)
    generated_test_file_name = "GeneratedTest.java"
    actual_generated_test_path = os.path.join(experiment_artifacts_dir, generated_test_file_name)

    with open(actual_generated_test_path, 'w', encoding='utf-8') as f:
        f.write(generated_code)

    print("Analyzing final effectiveness...")
    effectiveness_results = analyze_effectiveness(actual_generated_test_path, benchmark_dir_full_path, experiment_artifacts_dir)
    
    print("Analyzing final maintainability...")
    maintainability_results = analyze_maintainability(actual_generated_test_path, config['PMD_PATH'], config['RULESET_PATH'])
    
    final_results = {
        'experiment_id': experiment_id,
        'generator_name': f"{generator_name} ({model_name})",
        'prompt_strategy': prompt_strategy,
        'benchmark_name': benchmark_name,
        'time_cost': time_cost,
        'token_cost': len(generated_code.split()),
        'generated_test_path': actual_generated_test_path,
        'experiment_artifacts_dir': experiment_artifacts_dir,
        **effectiveness_results,
        **maintainability_results
    }
    add_experiment_result(final_results)
    print(f"--- Experiment {experiment_id} Finished and Saved ---")

if __name__ == "__main__":
    init_db()
    run_experiment(
        generator_name="Gemini-Pro",
        model_name="gemini-1.5-flash",
        prompt_strategy="chain_of_thought",
        benchmark_name="spring-petclinic"
    )