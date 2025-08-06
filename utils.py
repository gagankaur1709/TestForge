import json
import os
import re
from typing import Dict

def load_scenario(scenario_name: str) -> Dict:
    scenarios_file_path = os.path.join(os.path.dirname(__file__), 'scenarios_pilot.json')
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

def postprocess_java_test(raw_code: str, final_class_name: str, package_declaration: str) -> str:
    """
    Post-processes raw LLM-generated Java test code to fix common issues.
    """
    if not raw_code:
        return raw_code
    
    # Extract the actual test code from the response - handle various markdown formats
    code_patterns = [
        r'```java\s*(.*?)\s*```',  # ```java ... ```
        r'```\s*(.*?)\s*```',      # ``` ... ```
        r'`{3,}\s*(.*?)\s*`{3,}',  # Any number of backticks
    ]
    
    cleaned_code = raw_code
    for pattern in code_patterns:
        code_match = re.search(pattern, raw_code, re.DOTALL)
        if code_match:
            cleaned_code = code_match.group(1).strip()
            break
    
    # If no markdown blocks found, use the raw code but clean it
    if cleaned_code == raw_code:
        # Remove any leading/trailing markdown artifacts
        cleaned_code = re.sub(r'^[`\-\s]*', '', cleaned_code)
        cleaned_code = re.sub(r'[`\-\s]*$', '', cleaned_code)
    
    return cleaned_code
