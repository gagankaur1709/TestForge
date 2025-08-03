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


def postprocess_java_test_v2(generated_code: str, target_dir: str) -> str:
    """
    Performs basic cleanup on generated Java test code.
    - Removes lines with unfilled template placeholders (e.g., {testSetup})
    - Removes lines containing only a single curly brace
    - Ensures the correct package declaration is present
    
    Args:
        generated_code: The raw Java code string from the LLM.
        target_dir: The directory to save the cleaned file.
        class_name: The name to use for the output Java file.

    Returns:
        The file name of the cleaned Java file.
    """
    
    class_name = "OwnerRepositoryIntegrationTest"
    cleaned_lines = []
    for line in generated_code.splitlines():
        if re.search(r'\{\w+\}', line):
            continue

        if line.strip() in ['{', '}']:
            continue
            
        cleaned_lines.append(line)


    package_decl = 'package org.springframework.samples.petclinic.owner;'
    has_package = any(line.strip().startswith(package_decl) for line in cleaned_lines)
    
    if not has_package:
        cleaned_lines = [line for line in cleaned_lines if not line.strip().startswith('package ')]
        cleaned_lines.insert(0, package_decl)
    cleaned_code = '\n'.join(cleaned_lines)
    new_file_name = f"{class_name}.java"
    new_file_path = os.path.join(target_dir, new_file_name)
    with open(new_file_path, 'w', encoding='utf-8') as f:
        f.write(cleaned_code)
    return new_file_name