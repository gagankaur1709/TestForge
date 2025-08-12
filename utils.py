from calendar import c
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

def extract_method_return_types(class_code: str) -> Dict[str, str]:
    method_pattern = re.compile(
        r'(?:public|protected|private|static|\s)*\s*([\w<>\[\],\s]+)\s+(\w+)\s*\([^)]*\)\s*(?:throws\s+[\w,\s]+)?\s*\{'
    )
    return_types = {}
    
    for match in method_pattern.finditer(class_code):
        return_type = match.group(1).strip()
        method_name = match.group(2).strip()
        
        if return_type == method_name:
            continue

        return_type = re.sub(r'@\w+\s*', '', return_type).strip()
        
        return_types[method_name] = return_type
        
    return return_types

def _fix_mockito_numeric_literals_generic(code: str) -> str:
    long_returning_patterns = [
        r'getTotalElements', r'getTotalPages', r'getNumberOfElements',
        r'getSize', r'getNumber', r'count', r'size', r'length',
        r'getId', r'getCount', r'getTotalCount', r'getIndex',
        r'getPosition', r'getOffset', r'getLimit', r'getPage',
        r'getRow', r'getColumn', r'getLine', r'getRecord',
        r'getTotal', r'getAmount', r'getQuantity', r'getNumber',
        r'getSequence', r'getOrder', r'getRank', r'getScore'
    ]
    
    for pattern in long_returning_patterns:
        code = re.sub(
            rf'(when\s*\(\s*\w+\.{pattern}\s*\(\s*\)\s*\)\s*\.\s*thenReturn\s*\(\s*)(\d+)(\s*\))',
            r'\1\2L\3',
            code
        )
        code = re.sub(
            rf'(given\s*\(\s*\w+\.{pattern}\s*\(\s*\)\s*\)\s*\.\s*willReturn\s*\(\s*)(\d+)(\s*\))',
            r'\1\2L\3',
            code
        )

    int_returning_patterns = [
        r'getAge', r'getScore', r'getRating', r'getLevel',
        r'getPriority', r'getStatus', r'getType', r'getCategory',
        r'getVersion', r'getRevision', r'getBuild', r'getRelease'
    ]
    
    for pattern in int_returning_patterns:
        code = re.sub(
            rf'(when\s*\(\s*\w+\.{pattern}\s*\(\s*\)\s*\)\s*\.\s*thenReturn\s*\(\s*)(\d+)L(\s*\))',
            r'\1\2\3',
            code
        )
        code = re.sub(
            rf'(given\s*\(\s*\w+\.{pattern}\s*\(\s*\)\s*\)\s*\.\s*willReturn\s*\(\s*)(\d+)L(\s*\))',
            r'\1\2\3',
            code
        )
    
    float_returning_patterns = [
        r'getPrice', r'getCost', r'getAmount', r'getValue',
        r'getRate', r'getPercentage', r'getScore', r'getRating',
        r'getWeight', r'getHeight', r'getWidth', r'getLength',
        r'getDistance', r'getSpeed', r'getTemperature', r'getPressure'
    ]
    
    for pattern in float_returning_patterns:
        code = re.sub(
            rf'(when\s*\(\s*\w+\.{pattern}\s*\(\s*\)\s*\)\s*\.\s*thenReturn\s*\(\s*)(\d+\.\d+)(\s*\))',
            r'\1\2F\3',
            code
        )
        code = re.sub(
            rf'(given\s*\(\s*\w+\.{pattern}\s*\(\s*\)\s*\)\s*\.\s*willReturn\s*\(\s*)(\d+\.\d+)(\s*\))',
            r'\1\2F\3',
            code
        )
    
    code = re.sub(
        r'(\.thenReturn\s*\(\s*)(\d+)(\s*\))',
        r'\1\2L\3',
        code
    )
    
    return code

def _fix_mockito_argument_matchers(code: str) -> str:
    code = re.sub(r'any\(String\.class\)', 'anyString()', code)
    code = re.sub(r'any\(Integer\.class\)', 'anyInt()', code)
    code = re.sub(r'any\(Long\.class\)', 'anyLong()', code)
    code = re.sub(r'any\(Boolean\.class\)', 'anyBoolean()', code)
    code = re.sub(r'any\(Object\.class\)', 'any()', code)
    code = re.sub(r'any\(List\.class\)', 'anyList()', code)
    code = re.sub(r'any\(Set\.class\)', 'anySet()', code)
    code = re.sub(r'any\(Map\.class\)', 'anyMap()', code)
    
    if "anyString()" in code and "import static org.mockito.ArgumentMatchers.anyString;" not in code:
        code = re.sub(
            r'(import static org\.junit\.jupiter\.api\.Assertions\.\*;)',
            r'\1\nimport static org.mockito.ArgumentMatchers.*;',
            code
        )
    
    return code

def _fix_test_structure_issues(code: str) -> str:

    if 'class ' in code and 'public class ' not in code:
        code = re.sub(r'class (\w+)', r'public class \1', code, count=1)

    code = re.sub(r'@InjectMocks\s+private\s+', '@InjectMocks\n    ', code) 
    
    if '@InjectMocks' in code and '@ExtendWith' not in code:   # Fix missing @ExtendWith annotation
        code = re.sub(
            r'(public class \w+)',
            r'@ExtendWith(MockitoExtension.class)\n\1',
            code
        )
    code = re.sub(r'List<>', 'List<Object>', code)
    code = re.sub(r'Set<>', 'Set<Object>', code)
    code = re.sub(r'Map<>', 'Map<Object, Object>', code)
    code = re.sub(r'Collection<>', 'Collection<Object>', code)
    
    return code

def _type_aware_numeric_healing(code: str, class_under_test_code: str) -> str:
    # Get the reliable map of method names to their return types.
    return_types = extract_method_return_types(class_under_test_code)
    if not return_types:
        return code

    stub_pattern = re.compile(
        r'(when|given)\s*\(\s*(\w+)\.(\w+)\s*\([^)]*\)\s*\)\s*\.(?:thenReturn|willReturn)\s*\(\s*(\d+)(L|F|D)?\s*\)'
    )

    def replacer(match):
        full_match = match.group(0)
        # stub_type = match.group(1) # 'when' or 'given'
        # var_name = match.group(2)
        method_name = match.group(3)
        literal_value = match.group(4)
        existing_suffix = match.group(5)

        if method_name not in return_types:
            return full_match # Cannot determine return type, so don't change anything.

        expected_type = return_types[method_name].lower()
        
        # Determine the correct suffix based on the expected return type.
        correct_suffix = ''
        if 'long' in expected_type:
            correct_suffix = 'L'
        elif 'float' in expected_type:
            correct_suffix = 'F'
        elif 'double' in expected_type:
            correct_suffix = 'D'
            
        # If the existing suffix is already correct, do nothing.
        if existing_suffix == correct_suffix:
            return full_match
            
        # Reconstruct the stub with the corrected numeric literal.
        new_stub = full_match.replace(f"({literal_value}{existing_suffix or ''})", f"({literal_value}{correct_suffix})")
        return new_stub

    return stub_pattern.sub(replacer, code)

def cleanup_java_code(java_code: str, class_under_test_code: str) -> str:
    fixed = java_code

    # 1. Strip invalid annotations
    fixed = re.sub(
        r'@\s*(RequestParam|GetMapping|PostMapping|PutMapping|DeleteMapping)\([^)]\)\s', 
        '', 
        fixed
    )

    # 2. Fix abstract/interface instantiations
    replacements = {
        r'new\s+Model\s*\(\)': 'new ExtendedModelMap()',
        r'new\s+List\s*\(\)': 'new java.util.ArrayList<>()',
        r'new\s+Map\s*\(\)': 'new java.util.HashMap<>()'
    }
    for pattern, replacement in replacements.items():
        fixed = re.sub(pattern, replacement, fixed)

    # Add ExtendedModelMap import if used
    if "ExtendedModelMap" in fixed and "import org.springframework.ui.ExtendedModelMap;" not in fixed:
        fixed = re.sub(
            r'(import org\.springframework\.ui\.Model;)',
            r'\1\nimport org.springframework.ui.ExtendedModelMap;',
            fixed
        )

    # 3. Ensure Mockito static imports
    if "given(" in fixed and "import static org.mockito.BDDMockito.given;" not in fixed:
        fixed = re.sub(
            r'(import static org\.junit\.jupiter\.api\.Assertions\.\*;)',
            r'\1\nimport static org.mockito.BDDMockito.given;',
            fixed
        )
    if "verify(" in fixed and "import static org.mockito.Mockito.verify;" not in fixed:
        fixed = re.sub(
            r'(import static org\.junit\.jupiter\.api\.Assertions\.\*;)',
            r'\1\nimport static org.mockito.Mockito.verify;',
            fixed
        )

    # 4. Handle UnknownClass placeholder
    match = re.search(r'@InjectMocks\s+private\s+(\w+)\s+\w+;', fixed)
    if match:
        inject_class = match.group(1)
        if inject_class.lower().startswith("unknown"):
            pkg_match = re.search(r'package\s+([\w\.]+);', fixed)
            guessed_class = pkg_match.group(1).split('.')[-1].capitalize() + "Controller"
            fixed = fixed.replace(inject_class, guessed_class)

    # 5. Apply generic numeric literal fixes
    fixed = _fix_mockito_numeric_literals_generic(fixed)
    
    # 6. Apply the smarter Type-Aware Numeric Healing as backup
    fixed = _type_aware_numeric_healing(fixed, class_under_test_code)

    # 7. Fix common Mockito argument matcher issues (generic)
    fixed = _fix_mockito_argument_matchers(fixed)
    
    # 8. Fix common test structure issues (generic)
    fixed = _fix_test_structure_issues(fixed)
    
    # 9. Remove unused imports (optional cleanup)
    imports = re.findall(r'import\s+[\w\.\*]+;', fixed)
    for imp in imports:
        class_name = imp.split('.')[-1].replace(';', '')
        if class_name != '*' and class_name not in fixed.split(imp)[1]:
            fixed = fixed.replace(imp, '')

    return fixed.strip()

def _ensure_package_declaration(code: str, test_package: str) -> str:
    
    if code.strip().startswith('package '): # Check if package declaration already exists
        return code
    package_declaration = f"package {test_package};\n\n"     # If no package declaration, add it at the beginning
    cleaned_code = code.strip()     # Remove any leading whitespace or artifacts
    return package_declaration + cleaned_code     # Add package declaration at the beginning

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

def postprocess_java_test(raw_code: str, code_context: str) -> str:
    """
    Post-processes raw LLM-generated Java test code to fix common issues.
    """
    if not raw_code:
        return raw_code
    
    cleaned_code = remove_markdown_and_backticks(raw_code) # First, remove markdown and backticks
    package_match = re.search(r'package\s+([\w\.]+);', code_context)   # Extract package from code_context or use default
    test_package = package_match.group(1) if package_match else "org.springframework.samples.petclinic.vet" 
    cleaned_code = _ensure_package_declaration(cleaned_code, test_package)# Ensure package declaration is present 
    cleaned_code = cleanup_java_code(cleaned_code, code_context)
    
    return cleaned_code

def extract_imports_from_code(code: str) -> list[str]:
    """Extract all import statements from Java code."""
    return re.findall(r'import\s+[\w\.\*]+;', code)

def remove_imports_from_code(code: str) -> str:
    return re.sub(r'import\s+(?:static\s+)?[\w\.\*]+;', '', code).strip()

def build_solution_code(scenario: dict) -> str:
    """Build the solution code by combining prompt and canonical solution."""
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
