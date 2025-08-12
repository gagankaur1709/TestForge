import json
import os
import re
from typing import Dict

def load_scenario(scenario_name: str, benchmark_name: str = "spring-petclinic") -> Dict:
    scenarios_file_path = os.path.join(os.path.dirname(__file__), f'scenarios_{benchmark_name}.json')
    with open(scenarios_file_path, 'r') as f:
        scenarios = json.load(f)
    if scenario_name not in scenarios:
        raise ValueError(f"Error: Scenario '{scenario_name}' not found in {scenarios_file_path}.")
        
    return scenarios[scenario_name]

def load_prompt_template(prompt_strategy: str) -> str:
    template_path = os.path.join('prompts', f"{prompt_strategy}.txt")
    if not os.path.exists(template_path):
        raise FileNotFoundError(f"Error: Prompt template not found at '{template_path}'")
        
    with open(template_path, 'r') as f:
        return f.read()

def remove_markdown_and_backticks(raw_code: str) -> str:
    if not raw_code:
        return raw_code

    code_patterns = [
        r'```java\s*(.*?)\s*```', 
        r'```\s*(.*?)\s*```',     
        r'`{3,}\s*(.*?)\s*`{3,}',
    ]
    
    cleaned_code = raw_code
    for pattern in code_patterns:
        code_match = re.search(pattern, raw_code, re.DOTALL)
        if code_match:
            cleaned_code = code_match.group(1).strip()
            break
    
    if cleaned_code == raw_code:
        cleaned_code = re.sub(r'^[`\-\s]*', '', cleaned_code)
        cleaned_code = re.sub(r'[`\-\s]*$', '', cleaned_code)
    
    return cleaned_code

def load_code_context(benchmark_path: str, scenario: Dict) -> str:
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
    
def ensure_package_declaration(code: str, test_package: str) -> str:
    if code.strip().startswith('package '): # Check if package declaration already exists
        return code
    package_declaration = f"package {test_package};\n\n"     # If no package declaration, add it at the beginning
    cleaned_code = code.strip()     # Remove any leading whitespace or artifacts
    return package_declaration + cleaned_code     # Add package declaration at the beginning

def postprocess_java_test(raw_code: str, code_context: str) -> str:
    if not raw_code:
        return raw_code
    
    cleaned_code = remove_markdown_and_backticks(raw_code) # First, remove markdown and backticks
    package_match = re.search(r'package\s+([\w\.]+);', code_context)   # Extract package from code_context or use default
    test_package = package_match.group(1) if package_match else "org.springframework.samples.petclinic.vet" 
    cleaned_code = ensure_package_declaration(cleaned_code, test_package)# Ensure package declaration is present 
    
    return cleaned_code

def extract_imports_from_code(code: str) -> list[str]:
    return re.findall(r'import\s+[\w\.\*]+;', code)

def remove_imports_from_code(code: str) -> str:
    return re.sub(r'import\s+(?:static\s+)?[\w\.\*]+;', '', code).strip()

def build_solution_code(scenario: dict) -> str:
    return f"""
    {scenario['prompt']}
    {scenario['canonical_solution']}
    """

def get_required_imports() -> str:
    return """
    import static org.junit.jupiter.api.Assertions.*;
    import static org.junit.jupiter.api.Assertions.assertFalse;
    import static org.junit.jupiter.api.Assertions.assertTrue;
    import static org.junit.jupiter.api.Assertions.assertEquals;
    import static org.junit.jupiter.api.Assertions.assertThrows;
    import static org.junit.jupiter.api.Assertions.assertNotNull;
    import static org.junit.jupiter.api.Assertions.assertNull;
    import static org.junit.jupiter.api.Assertions.assertArrayEquals;
    import org.mockito.Mockito;
    import org.mockito.junit.jupiter.MockitoExtension;
    import org.junit.jupiter.api.extension.ExtendWith;
    import org.junit.jupiter.api.Test;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.AfterEach;
    import org.junit.jupiter.api.BeforeAll;
    """

def combine_humaneval_java_code(scenario: dict, generated_test_code: str) -> str:
    imports_from_solution = extract_imports_from_code(scenario['prompt'])
    imports_from_llm = extract_imports_from_code(generated_test_code)
    all_imports = sorted(list(set(imports_from_solution + imports_from_llm)))
    import_block = "\n".join(all_imports)
    test_class_code = remove_imports_from_code(generated_test_code)
    
    solution_code = build_solution_code(scenario)

    required_imports = get_required_imports()

    return f"""
    {import_block}
    {required_imports}
    {solution_code}
    {test_class_code}
    """
