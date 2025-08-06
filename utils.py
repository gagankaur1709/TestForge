import json
import os
import re
from typing import Dict

def load_scenario(scenario_name: str) -> Dict:
    scenarios_file_path = os.path.join(os.path.dirname(__file__), 'scenarios_spring-petclinic.json')
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

def load_code_context(benchmark_path: str, scenario: Dict) -> str:
    """
    Loads and concatenates the source code for the main file and its
    specified dependencies for a unit test scenario.
    """
    all_code_parts = []
    
    files_to_load = scenario.get('files', []) + scenario.get('dependencies', [])
    
    print(f"Loading context for scenario: {scenario.get('description', 'No description')}")

    for relative_path in files_to_load:
        full_path = os.path.join(benchmark_path, relative_path)
        
        if os.path.exists(full_path):
            with open(full_path, 'r', encoding='utf-8') as f:
                all_code_parts.append(f"// --- File: {relative_path} ---\n")
                all_code_parts.append(f.read())
                all_code_parts.append("\n\n")
        else:
            # Raise an error if a file is missing
            raise FileNotFoundError(f"Error: Benchmark source file not found at {full_path}")
            
    if not all_code_parts:
        raise ValueError("Error: No valid source files found for scenario.")

    return "".join(all_code_parts)

def postprocess_java_test(generated_code: str, class_name: str, package_decl: str) -> str:
    """
    Cleans LLM-generated Java code:
    - Removes markdown fences like ```java and ```
    - Replaces the class name with a specified one
    - Ensures the correct package declaration
    
    Args:
        generated_code: The raw code string from the LLM (possibly fenced).
        class_name: The desired class name.
        package_decl: The package name to insert.
    
    Returns:
        A cleaned Java code string.
    """

    # Step 1: Remove triple backticks at the start and end (```java or ```)
    match = re.search(r"```(?:java)?(.*)```", generated_code, re.DOTALL)
    
    if match:
        # If a markdown block is found, its content is in the first captured group.
        code_to_process = match.group(1).strip()
    else:
        # If no markdown block is found, assume the whole string is code and clean it up.
        code_to_process = generated_code.strip()

    # Step 2: Replace the class name
    class_pattern = re.compile(r'public\s+class\s+\w+')
    if class_pattern.search(code_to_process):
        cleaned_code = class_pattern.sub(f'public class {class_name}', code_to_process, count=1)
    else:
        cleaned_code = f"public class {class_name} {{\n{code_to_process}\n}}"

    # Step 3: Ensure package declaration is correct
    if not cleaned_code.strip().startswith(f"package {package_decl};"):
        cleaned_code = re.sub(r'^package\s+[\w.]+;\s*', '', cleaned_code, flags=re.MULTILINE)
        cleaned_code = f"package {package_decl};\n\n{cleaned_code}"

    return cleaned_code
