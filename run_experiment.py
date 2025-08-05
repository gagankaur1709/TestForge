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
from evaluation.effectiveness import analyze_effectiveness, check_compilation
from evaluation.maintainability import analyze_maintainability
from utils import load_prompt_template, load_scenario, load_code_context, postprocess_java_test


GENERATOR_REGISTRY = {
    'Google Gemini': {'class': GeminiGenerator, 'required_keys': ['GOOGLE_API_KEY'], 'type': 'llm'},
    'Groq Llama': {'class': CodeLlamaGenerator, 'required_keys': ['GROQ_API_KEY'], 'type': 'llm'},
    'DeepSeek': {'class': DeepSeekGenerator, 'required_keys': ['DEEPSEEK_API_KEY'], 'type': 'llm'},
    'EvoSuite': {'class': EvoSuiteGenerator, 'required_keys': ['EVOSUITE_JAR_PATH'], 'type': 'traditional'},
    'Randoop': {'class': RandoopGenerator, 'required_keys': ['RANDOOP_JAR_PATH'], 'type': 'traditional'}
}

def run_experiment(generator_name, model_name, prompt_strategy, benchmark_name, scenario_name):
    """
    Orchestrates a single, complete experiment run, handling both LLM and traditional generators.
    """
    exp_id_name = model_name or generator_name.replace(' ', '-')
    experiment_id = f"{exp_id_name}_{scenario_name}_{prompt_strategy or 'default'}_{uuid.uuid4().hex[:8]}"
    final_class_name = f"GeneratedTest_{experiment_id}"
    print(f"\n--- Starting Experiment: {experiment_id} ---")

    # --- 1. Configuration Setup ---
    config = {
        "PMD_PATH": "/Users/gagan/tools/pmd-bin-7.15.0", # IMPORTANT: Update this path
        "RULESET_PATH": "rulesets/maintainability_rules.xml"
    }
    
    if generator_name not in GENERATOR_REGISTRY:
        raise ValueError(f"Unknown generator: {generator_name}")
    
    gen_info = GENERATOR_REGISTRY[generator_name]
    for key in gen_info['required_keys']:
        value = getattr(Config, key, None)
        if not value:
            raise ValueError(f"Required config key '{key}' is missing from your .env or config.py file.")
        config[key] = value

    benchmark_dir_full_path = os.path.join(Config.BENCHMARK_DIR, benchmark_name)
    generator = gen_info['class'](config=config)
    
    # --- 2. Load Scenario and Prepare Generator Input ---
    try:
        scenario = load_scenario(scenario_name) # Assumes one 'scenarios.json' for unit tests
        if gen_info['type'] == 'llm':
            code_context = load_code_context(benchmark_dir_full_path, scenario)
            # prompt_template = load_prompt_template(prompt_strategy) # Simplified call
            # formatted_prompt = prompt_template.format(code_context=code_context)
        else: # For 'traditional' tools
            class_file_path = scenario['files'][0]
            code_context = class_file_path.replace('src/main/java/', '').replace('.java', '').replace('/', '.')
            config['BENCHMARK_DIR'] = benchmark_dir_full_path
    except Exception as e:
        print(f"Failed to load scenario or context: {e}")
        return

    # --- 3. Generation Phase (Conditional Logic) ---
    generated_code = None
    time_cost = 0.0

    if gen_info['type'] == 'llm':
        # --- LLM PATH: Use Self-Correction Loop ---
        max_retries = 2
        current_code = ""
        build_log = ""
        for attempt in range(max_retries):
            print(f"\n--- LLM Generation Attempt {attempt + 1}/{max_retries} ---")
            if attempt == 0:
                prompt_template = load_prompt_template(prompt_strategy)
                formatted_prompt = prompt_template.format(code_context=code_context, class_name=final_class_name)
                start_time = time.time()
                current_code = generator.generate(formatted_prompt, prompt_strategy, model_name)
                time_cost = time.time() - start_time
            else:
                repair_template = load_prompt_template('repair')
                repair_prompt = repair_template.format(broken_code=current_code, error_message=build_log)
                current_code = generator.generate(repair_prompt, 'repair', model_name)
            
            if "Error:" in current_code:
                print(f"Generator returned an error: {current_code}")
                continue

            generated_code = current_code
    else:
        # --- TRADITIONAL TOOL PATH: Single Pass ---
        print(f"\n--- Running Traditional Generator: {generator_name} ---")
        start_time = time.time()
        generated_code = generator.generate(code_context)
        time_cost = time.time() - start_time
        if "Error:" in generated_code:
            print(f"Generator failed: {generated_code}")
            generation_successful = False
            
            # Create a dictionary to log the failure to the database
            failure_results = {
                'experiment_id': experiment_id,
                'generator_name': f"{generator_name} ({model_name or 'N/A'})",
                'prompt_strategy': 'N/A',
                'benchmark_name': benchmark_name,
                'time_cost': time_cost,
                'token_cost': 0,
                'output_path': None,
                'compiles': False,
                'runs_successfully': False,
                'fault_detected': False,
                'line_coverage': 0.0,
                'branch_coverage': 0.0,
                'cyclomatic_complexity': None,
                'cognitive_complexity': None,
                'coupling_between_objects': None,
                'test_brittleness_score': None
            }
            add_experiment_result(failure_results)
            print(f"--- Failure for experiment {experiment_id} has been logged. ---")
            return


    # --- 4. Final Evaluation and Storage ---
    if not generated_code or "Error:" in generated_code:
        print("Failed to generate valid code after all attempts. Ending experiment.")
        return

    experiment_artifacts_dir = os.path.join('outputs', experiment_id)
    os.makedirs(experiment_artifacts_dir, exist_ok=True)
    
    # Use a unique name for the test file to avoid conflicts
    if gen_info['type'] == 'llm':
        final_class_name = f"GeneratedTest_{experiment_id}"
        package_declaration = scenario['test_destination'].replace('src/test/java/', '').replace('/', '.')
        
        print("Post-processing LLM-generated code...")
        cleaned_code = postprocess_java_test(generated_code, final_class_name, package_declaration)
        
        actual_test_path = os.path.join(experiment_artifacts_dir, f"{final_class_name}.java")
        with open(actual_test_path, 'w', encoding='utf-8') as f:
            f.write(cleaned_code)
    elif generator_name == 'Randoop':
        final_class_name = "RegressionTest0" # Use Randoop's default class name
    elif generator_name == 'EvoSuite':
        final_class_name = "GeneratedEvoSuiteTest" # Use a consistent name for EvoSuite
    else:
        final_class_name = "GeneratedTest"
    # Here you could call your post-processing script if needed
    # For now, we'll just save the raw successful code
    actual_test_path = os.path.join(experiment_artifacts_dir, f"{final_class_name}.java")
    with open(actual_test_path, 'w', encoding='utf-8') as f:
        f.write(generated_code)

    print("\nAnalyzing final effectiveness...")
    effectiveness_results = analyze_effectiveness(actual_test_path, benchmark_dir_full_path, experiment_artifacts_dir)
    
    print("Analyzing final maintainability...")
    maintainability_results = analyze_maintainability(actual_test_path, config['PMD_PATH'], config['RULESET_PATH'])
    
    final_results = {
        'experiment_id': experiment_id,
        'generator_name': f"{generator_name} ({model_name or 'N/A'})",
        'prompt_strategy': prompt_strategy if gen_info['type'] == 'llm' else 'N/A',
        'benchmark_name': benchmark_name,
        'time_cost': time_cost,
        'token_cost': len(generated_code.split()) if gen_info['type'] == 'llm' else 0,
        'output_path': experiment_artifacts_dir,
        **effectiveness_results,
        **maintainability_results
    }

    add_experiment_result(final_results)
    print(f"--- Experiment {experiment_id} Finished and Saved ---")


if __name__ == "__main__":
    init_db()
    
    # run_experiment(
    #     generator_name="Groq Llama",
    #     model_name="llama3-8b-8192",
    #     prompt_strategy="role_playing",
    #     benchmark_name="spring-petclinic",
    #     scenario_name="owner_model" 
    # ) 

    # run_experiment(
    #     generator_name = "Randoop",
    #     model_name = None,
    #     prompt_strategy = None,
    #     benchmark_name="spring-petclinic",
    #     scenario_name="owner_controller" 
    # )  