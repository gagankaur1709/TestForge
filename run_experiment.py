# run_experiment.py (Updated for cleaner file handling)

import os
import time
import uuid
import subprocess
from config import Config
from database import init_db, add_experiment_result
from generator.geminiGenerator import GeminiGenerator
from generator.deepseekGenerator import DeepSeekGenerator
from generator.codellama_generator import CodeLlamaGenerator
from evaluation.effectiveness import analyze_effectiveness
from evaluation.maintainability import analyze_maintainability
from utils import load_prompt_template, format_prompt, load_scenario, load_code_context, postprocess_java_test

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
    experiment_id = f"{model_name}_{prompt_strategy}_{uuid.uuid4().hex[:8]}"
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
            raise ValueError(f"Required config key '{key}' is missing for generator '{generator_name}'.")
        config[key] = value

    benchmark_dir_full_path = os.path.join(Config.BENCHMARK_DIR, benchmark_name)

    print(f"Running 'mvn clean' in {benchmark_dir_full_path} to ensure a clean build...")
    clean_result = subprocess.run(["mvn", "clean"], cwd=benchmark_dir_full_path, capture_output=True, text=True)
    if clean_result.returncode != 0:
        print(f"Maven clean failed:\n{clean_result.stdout}\n{clean_result.stderr}")
    else:
        print("Maven clean completed.")

    generator_class = gen_info['class']
    generator = generator_class(config=config)

    try:
        scenario = load_scenario('sql_integration_owners')
        code_context_data = load_code_context(benchmark_dir_full_path, scenario)
        # Load and format the prompt
        prompt_template = load_prompt_template(prompt_strategy, scenario)
        formatted_prompt = format_prompt(prompt_template, code_context_data) 

    except (FileNotFoundError, ValueError) as e:
        print(f"Failed to load scenario: {e}")
        return

    start_time = time.time()
    generated_code = generator.generate(prompt=formatted_prompt,
        context=code_context_data,
        model_name=model_name)
    time_cost = time.time() - start_time
    if "Error:" in generated_code:
        print(f"Failed to generate code: {generated_code}")
        return

    maven_test_target_dir = os.path.join(
        benchmark_dir_full_path, 
        'src', 'test', 'java', 'org', 'springframework', 'samples', 'petclinic', 'owner'
    )
    os.makedirs(maven_test_target_dir, exist_ok=True)
    
    generated_test_file_name = postprocess_java_test(generated_code, maven_test_target_dir)
    actual_generated_test_path = os.path.join(maven_test_target_dir, generated_test_file_name)
    
    print(f"Generated test file saved to Maven test directory: {actual_generated_test_path}")

    experiment_artifacts_dir = os.path.join('outputs', experiment_id)
    os.makedirs(experiment_artifacts_dir, exist_ok=True)
    
    with open(os.path.join(experiment_artifacts_dir, f"raw_{generated_test_file_name}"), 'w', encoding='utf-8') as f:
        f.write(generated_code)
    print(f"Raw generated code saved to: {os.path.join(experiment_artifacts_dir, f'raw_{generated_test_file_name}')}")


    print("Analyzing effectiveness...")
    effectiveness_results = analyze_effectiveness(actual_generated_test_path, benchmark_dir_full_path, experiment_artifacts_dir)  
    print("Analyzing maintainability...")
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
        prompt_strategy="self_correction",
        benchmark_name="spring-petclinic"
    )