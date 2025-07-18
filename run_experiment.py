# run_experiment.py

import os
import time
import uuid
from config import Config
from database import init_db, add_experiment_result
from generator.geminiGenerator import GeminiGenerator
from generator.deepseekGenerator import DeepSeekGenerator
from generator.codellama_generator import CodeLlamaGenerator
from evaluation.effectiveness import analyze_effectiveness
from evaluation.maintainability import analyze_maintainability

def load_code_context(class_names, benchmark_path):
    """
    Loads the source code for the given Java class names from the benchmark project.
    Args:
        class_names: List of class names
        benchmark_path: Path to the root of the benchmark project 
    Returns:
        A string containing the concatenated source code of the selected classes.
    """
    src_root = os.path.join(benchmark_path, 'src', 'main', 'java', 'org', 'springframework', 'samples', 'petclinic')
    packages = ['owner', 'model', 'vet', 'system']
    code = ''
    for pkg in packages:
        pkg_dir = os.path.join(src_root, pkg)
        if not os.path.isdir(pkg_dir):
            continue
        for class_name in class_names:
            java_file = os.path.join(pkg_dir, f'{class_name}.java')
            if os.path.isfile(java_file):
                with open(java_file, 'r') as f:
                    code += f'// File: {pkg}/{class_name}.java\n' + f.read() + '\n\n'
    return code

def run_experiment(generator_name, model_name, prompt_strategy, benchmark_name):
    experiment_id = f"{model_name}_{prompt_strategy}_{uuid.uuid4().hex[:8]}"
    print(f"\n--- Starting Experiment: {experiment_id} ---")
    config = {
        "GOOGLE_API_KEY": Config.GOOGLE_API_KEY,
        "PMD_PATH": "/Users/gagan/tools/pmd-bin-7.15.0",
        "RULESET_PATH": "rulesets/maintainability_rules.xml"
    }
    
    benchmark_path = os.path.join(Config.BENCHMARK_DIR, benchmark_name)

    if generator_name == 'Gemini-Pro':
        generator = GeminiGenerator(config=config)
    elif generator_name == 'CodeLlama-70b':
        generator = CodeLlamaGenerator(config=config)
    elif generator_name == 'DeepSeek': 
        generator = DeepSeekGenerator(config=config)
    # elif generator_name == 'EvoSuite':
    #     generator = EvoSuiteGenerator(config=config)
    else:
        raise ValueError(f"Unknown generator: {generator_name}")

    class_names = ["Owner", "Pet", "Visit", "OwnerController", "PetController", "Vet", "VetController"]
    code_context = load_code_context(class_names, benchmark_path)
    if not code_context:
        print("Failed to load code context. Check class names and paths.")
        return

    start_time = time.time()
    generated_code = generator.generate(code_context, prompt_strategy, model_name)
    time_cost = time.time() - start_time
    if "Error:" in generated_code:
        print(f"Failed to generate code: {generated_code}")
        return

    output_dir = os.path.join('outputs', experiment_id)
    os.makedirs(output_dir, exist_ok=True)
    test_file_path = os.path.join(output_dir, "GeneratedTest.java")
    with open(test_file_path, 'w') as f:
        f.write(generated_code)

    print("Analyzing effectiveness...")
    effectiveness_results = analyze_effectiveness(test_file_path, benchmark_path, output_dir)
    print("Analyzing maintainability...")
    maintainability_results = analyze_maintainability(test_file_path, config['PMD_PATH'], config['RULESET_PATH'])
    
    final_results = {
        'experiment_id': experiment_id,
        'generator_name': f"{generator_name} ({model_name})",
        'prompt_strategy': prompt_strategy,
        'benchmark_name': benchmark_name,
        'time_cost': time_cost,
        'token_cost': len(generated_code.split()),
        'output_path': output_dir,
        **effectiveness_results,
        **maintainability_results
    }

    add_experiment_result(final_results)
    print(f"--- Experiment {experiment_id} Finished and Saved ---")


if __name__ == "__main__":
    init_db()

