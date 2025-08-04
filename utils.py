import json
import os
import re
from typing import Dict

def load_scenario(scenario_name: str) -> Dict:
    scenarios_file_path = os.path.join(os.path.dirname(__file__), 'scenarios.json')
    with open(scenarios_file_path, 'r') as f:
        scenarios = json.load(f)
    if scenario_name not in scenarios:
        raise ValueError(f"Error: Scenario '{scenario_name}' not found in {scenarios_file_path}.")
        
    return scenarios[scenario_name]

def load_prompt_template(prompt_strategy: str) -> str:
    """Load the appropriate prompt template for the strategy."""
    template_path = os.path.join('prompts', f"{prompt_strategy}.txt")
    if not os.path.exists(template_path):
        raise FileNotFoundError(f"Error: Prompt template not found at '{template_path}'")
        
    with open(template_path, 'r') as f:
        return f.read()

def load_code_context(benchmark_path: str, scenario: Dict) -> Dict:
    """Enhanced to include prompt context."""
    all_code = []
    
    for relative_path in scenario.get('files', []):
        full_path = os.path.join(benchmark_path, relative_path)
        
        if os.path.exists(full_path):
            with open(full_path, 'r', encoding='utf-8') as f:
                all_code.append(f"// --- File: {relative_path} ---\n")
                all_code.append(f.read())
        else:
            raise FileNotFoundError(f"Error: Benchmark source file not found at {full_path}")          
    if not all_code:
        raise ValueError(f"Error: No valid source files found for scenario '{scenario.get('description', 'N/A')}'.")
    return "".join(all_code)

def postprocess_java_test(generated_code: str, class_name: str, package_decl: str) -> str:
    """
    Performs a robust cleanup of the raw generated Java code.

    Args:
        generated_code: The raw code string from the LLM.
        class_name: The desired public class name for the test.
        package_decl: The package declaration to ensure is present.

    Returns:
        The cleaned Java code as a string.
    """
    # Replace any public class declaration with the correct unique one
    # This handles cases where the LLM names the class something different.
    cleaned_code = re.sub(r'public class \w+', f'public class {class_name}', generated_code)
    
    # Ensure the correct package declaration is present at the top
    if not cleaned_code.strip().startswith(f"package {package_decl};"):
        # Remove any other incorrect package declarations the LLM might have added
        cleaned_code = re.sub(r'package [\w.]+;\s*', '', cleaned_code)
        # Insert the correct one at the very top
        cleaned_code = f"package {package_decl};\n\n" + cleaned_code
        
    return cleaned_code