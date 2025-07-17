# run_experiment.py

import os
import time
import uuid
from config import Config
from database import init_db, add_experiment_result
from generator.geminiGenerator import GeminiGenerator
from evaluation.effectiveness import analyze_effectiveness
from evaluation.maintainability import analyze_maintainability

def run_experiment(generator_name, prompt_strategy, benchmark_name):
    experiment_id = f"{generator_name}_{prompt_strategy}_{uuid.uuid4().hex[:8]}"
    print(f"\n--- Starting Experiment: {experiment_id} ---")
    config = {
        "GOOGLE_API_KEY": Config.GOOGLE_API_KEY,
        "PMD_PATH": "/Users/gagan/tools/pmd-bin-7.15.0", # IMPORTANT: Update this path
        "RULESET_PATH": "rulesets/maintainability_rules.xml"
    }
    
    benchmark_path = os.path.join(Config.BENCHMARK_DIR, benchmark_name)

    if generator_name == 'Gemini-Pro':
        generator = GeminiGenerator(config=config)
    # elif generator_name == 'EvoSuite':
    #     generator = EvoSuiteGenerator(config=config)
    else:
        raise ValueError(f"Unknown generator: {generator_name}")

    # Load the code context from the benchmark
    # This is a placeholder - you'll need to build a function to select
    # specific classes from the benchmark project.
    code_context = "public class Owner { /* ... source code ... */ }" # Placeholder

    start_time = time.time()
    generated_code = generator.generate(code_context, prompt_strategy)
    time_cost = time.time() - start_time
    if "Error:" in generated_code:
        print(f"Failed to generate code: {generated_code}")
        return

    output_dir = os.path.join('outputs', experiment_id)
    os.makedirs(output_dir, exist_ok=True)
    test_file_path = os.path.join(output_dir, "GeneratedTest.java")
    with open(test_file_path, 'w') as f:
        f.write(generated_code)

    effectiveness_results = analyze_effectiveness(test_file_path, benchmark_path, output_dir)
    maintainability_results = analyze_maintainability(test_file_path, config['PMD_PATH'], config['RULESET_PATH'])
    
    final_results = {
        'experiment_id': experiment_id,
        'generator_name': generator_name,
        'prompt_strategy': prompt_strategy,
        'benchmark_name': benchmark_name,
        'time_cost': time_cost,
        'token_cost': len(generated_code.split()), # Simple token approximation
        'output_path': output_dir,
        **effectiveness_results,
        **maintainability_results
    }

    add_experiment_result(final_results)
    print(f"--- Experiment {experiment_id} Finished and Saved ---")


if __name__ == "__main__":
    init_db()
    run_experiment(
        generator_name='Gemini-Pro',
        prompt_strategy='chain_of_thought',
        benchmark_name='spring-petclinic'
    )

