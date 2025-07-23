import json
import os
import re
from typing import Dict

def load_scenario(scenario_name: str) -> Dict:
    scenarios_file_path = os.path.join(os.path.dirname(__file__), 'scenarios.json')
    with open(scenarios_file_path, 'r') as f:
        scenarios = json.load(f)
    return scenarios[scenario_name]

def load_prompt_template(prompt_strategy: str, scenario: Dict) -> str:
    """Load the appropriate prompt template for the strategy."""
    template_path = scenario['prompt_templates'][prompt_strategy]
    full_path = os.path.join(os.path.dirname(__file__), template_path)
    with open(full_path, 'r') as f:
        return f.read()

def format_prompt(template: str, context: dict) -> str:
    try:
        return template.format(
            scenario=context['scenario'],
            code_context=context['files']
        )
    except Exception as e:
        print(f"Prompt formatting failed: {e}. Context keys: {context.keys()}")
        raise

def load_code_context(benchmark_path: str, scenario: Dict) -> Dict:
    """Enhanced to include prompt context."""
    code_context = {}
    for relative_path in scenario['context_files']:
        full_path = os.path.join(benchmark_path, relative_path)
        with open(full_path, 'r', encoding='utf-8') as f:
            code_context[relative_path] = f.read()
    
    return {
        "scenario": {
            "description": scenario.get("description", ""),
            "integration_points": scenario.get("integration_points", []),
            "context_files": scenario.get("context_files", [])
        },
        "files": code_context
    }


def postprocess_java_test(generated_code: str, target_dir: str) -> str:
    """
    Post-processes the generated Java test code to extract the class name
    and writes the file to the specified target directory.
    """
    class_name = "GeneratedTest"
    match = re.search(r'public\s+class\s+(\w+)', generated_code)
    if match:
        class_name = match.group(1)
    
    new_file_name = f"{class_name}.java"
    new_file_path = os.path.join(target_dir, new_file_name)

    try:
        with open(new_file_path, 'w', encoding='utf-8') as f:
            f.write(generated_code)
        # Removed the print statement here as it's handled in run_experiment.py
    except Exception as e:
        print(f"Error writing generated test to {new_file_path}: {e}")
        # Consider re-raising or handling this error more robustly
        
    return new_file_name