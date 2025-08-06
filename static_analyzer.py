import os
import re

def analyze_java_file(file_path: str):
    """
    Performs a more advanced static analysis on a Java file to extract
    key information needed to build a rich test scaffold.
    """
    if not os.path.exists(file_path): return None

    with open(file_path, 'r', encoding='utf-8') as f:
        content = f.read()

    package_match = re.search(r'package\s+([\w.]+);', content)
    imports = re.findall(r'import\s+[\w\.\*]+;', content)
    class_match = re.search(r'public\s+class\s+(\w+)', content)
    class_name = class_match.group(1) if class_match else "UnknownClass"
    

    field_deps = re.findall(r'@\w*Autowired\s+(?:private|public)\s+([\w\.<>]+)\s+(\w+);', content)
    
    constructor_deps = []
    constructor_match = re.search(rf'public\s+{class_name}\s*\((.*?)\)', content)
    if constructor_match:
        params = constructor_match.group(1).split(',')
        for param in params:
            param = param.strip()
            match = re.match(r'([\w\.<>]+)\s+(\w+)', param)
            if match:
                constructor_deps.append((match.group(1), match.group(2)))
    
    dependencies_to_mock = list(set(field_deps + constructor_deps))

    public_methods = re.findall(r'public\s+(?:[\w\s<>\[\],]+)\s+(\w+\s*\(.*?\))\s*(?:throws\s+[\w,.\s]+)?\s*\{', content)
    
    return {
        "package": package_match.group(1) if package_match else "",
        "imports": imports,
        "class_name": class_name,
        "dependencies_to_mock": dependencies_to_mock,
        "public_methods": list(dict.fromkeys(public_methods))
    }