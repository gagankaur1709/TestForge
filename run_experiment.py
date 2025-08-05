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
    sanitized_id_for_java = experiment_id.replace('-', '_')
    final_class_name = f"GeneratedTest_{sanitized_id_for_java}"
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
        # --- LLM PATH: Use Self-Correction Loop with Corrected Logic ---
        max_retries = 2
        raw_code = ""
        cleaned_code = "" # This will now be the variable we test
        build_log = ""
        
        for attempt in range(max_retries):
            print(f"\n--- LLM Generation Attempt {attempt + 1}/{max_retries} ---")
            
            sanitized_id_for_java = experiment_id.replace('-', '_')
            final_class_name = f"GeneratedTest_{sanitized_id_for_java}"
            package_declaration = scenario['test_destination'].replace('src/test/java/', '').replace('/', '.')

            if attempt == 0:
                # Initial Generation
                prompt_template = load_prompt_template(prompt_strategy)
                formatted_prompt = prompt_template.format(code_context=code_context, class_name=final_class_name)
                start_time = time.time()
                raw_code = generator.generate(formatted_prompt, prompt_strategy, model_name)
                time_cost = time.time() - start_time
            else:
                # Repair Attempt
                repair_template = load_prompt_template('repair')
                # The broken code is the *cleaned* code from the previous failed attempt
                repair_prompt = repair_template.format(broken_code=cleaned_code, error_message=build_log)
                raw_code = generator.generate(repair_prompt, 'repair', model_name)
            
            if not raw_code or "Error:" in raw_code:
                print(f"Generator returned an error or empty code: {raw_code}")
                continue

            # --- THIS IS THE FIX ---
            # 1. Post-process the raw code IMMEDIATELY after generation.
            print("Post-processing LLM-generated code...")
            cleaned_code = postprocess_java_test(raw_code, final_class_name, package_declaration)
            
            # 2. Check compilation on the CLEANED code.
            test_destination = os.path.join(benchmark_dir_full_path, scenario['test_destination'])
            compiles, build_log = check_compilation(cleaned_code, final_class_name, benchmark_dir_full_path, test_destination)
            # --- END OF FIX ---

            if compiles:
                print("Code compiled successfully!")
                generated_code = cleaned_code # The final good code is the cleaned version
                break
            else:
                # Save artifacts for the FAILED cleaned code
                experiment_artifacts_dir = os.path.join('outputs', experiment_id)
                os.makedirs(experiment_artifacts_dir, exist_ok=True)
                log_filename = f"build_failure_log_attempt_{attempt + 1}.txt"
                log_filepath = os.path.join(experiment_artifacts_dir, log_filename)
                with open(log_filepath, 'w', encoding='utf-8') as f:
                    f.write(build_log)

                failed_test_filename = f"FailedTest_attempt_{attempt + 1}.java"
                failed_test_filepath = os.path.join(experiment_artifacts_dir, failed_test_filename)
                with open(failed_test_filepath, 'w', encoding='utf-8') as f:
                    f.write(cleaned_code) # Save the cleaned code that failed

                print(f"Compilation failed. Full log and the failed (cleaned) test file have been saved.")
        
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


    if not generated_code or "Error:" in generated_code:
        print("Failed to generate valid code after all attempts. Ending experiment.")
        return

    experiment_artifacts_dir = os.path.join('outputs', experiment_id)
    os.makedirs(experiment_artifacts_dir, exist_ok=True)
    
    
    if generator_name == 'Randoop':
        final_class_name = "RegressionTest0" # Use Randoop's default class name
    elif generator_name == 'EvoSuite':
        final_class_name = "GeneratedEvoSuiteTest"
     # Use a consistent name for EvoSuite
    cleaned_code = generated_code
    # Here you could call your post-processing script if needed
    # For now, we'll just save the raw successful code
    
    actual_test_path = os.path.join(experiment_artifacts_dir, f"{final_class_name}.java")
    with open(actual_test_path, 'w', encoding='utf-8') as f:
        f.write(cleaned_code)

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