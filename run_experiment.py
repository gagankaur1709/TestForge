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
from utils import load_prompt_template, load_scenario, load_code_context


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
    experiment_id = f"{generator_name.replace(' ', '-')}_{model_name}_{prompt_strategy}_{uuid.uuid4().hex[:8]}"
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
        config[key] = getattr(Config, key)

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
        # --- LLM PATH: Use Self-Correction Loop ---
        max_retries = 3
        current_code = ""
        for attempt in range(max_retries):
            print(f"\n--- LLM Generation Attempt {attempt + 1}/{max_retries} ---")
            if attempt == 0:
                prompt_template = load_prompt_template(prompt_strategy)
                formatted_prompt = prompt_template.format(code_context=code_context)
                start_time = time.time()
                current_code = generator.generate(formatted_prompt, prompt_strategy, model_name)
                time_cost = time.time() - start_time
            else:
                repair_template = load_prompt_template('self_correction')
                repair_prompt = repair_template.format(broken_code=current_code, error_message=build_log)
                current_code = generator.generate(repair_prompt, 'self_correction', model_name)
            
            if "Error:" in current_code:
                print(f"Generator returned an error: {current_code}")
                continue

            test_destination = os.path.join(benchmark_dir_full_path, scenario['test_destination'])
            compiles, build_log = check_compilation(current_code, f"GeneratedTest_{experiment_id}", test_destination)
            if compiles:
                print("✅ Code compiled successfully!")
                generated_code = current_code
                break
    else:
        # --- TRADITIONAL TOOL PATH: Single Pass ---
        print(f"\n--- Running Traditional Generator: {generator_name} ---")
        start_time = time.time()
        generated_code = generator.generate(code_context)
        time_cost = time.time() - start_time


    # --- 4. Final Evaluation and Storage ---
    if not generated_code or "Error:" in generated_code:
        print("Failed to generate valid code after all attempts. Ending experiment.")
        return

    experiment_artifacts_dir = os.path.join('outputs', experiment_id)
    os.makedirs(experiment_artifacts_dir, exist_ok=True)
    
    # Use a unique name for the test file to avoid conflicts
    if gen_info['type'] == 'llm':
        final_class_name = f"GeneratedTest_{experiment_id}"
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
    #     generator_name="Google Gemini",
    #     model_name="gemini-1.5-flash-latest",
    #     prompt_strategy="chain_of_thought",
    #     benchmark_name="spring-petclinic",
    #     scenario_name="owner_model" # Use a unit test scenario
    # )

    # Example of running a traditional tool experiment for a UNIT TEST
    run_experiment(
        generator_name="Randoop",
        model_name=None, # Not applicable
        prompt_strategy=None, # Not applicable
        benchmark_name="spring-petclinic",
        scenario_name="owner_model" # Use the same unit test scenario
    )