import os
import json
import re

def build_class_index(source_dir: str) -> dict:
    """
    Scans the entire source directory to build an index mapping simple
    class names to their full relative paths.
    """
    class_index = {}
    for root, _, files in os.walk(source_dir):
        for file in files:
            if file.endswith(".java"):
                class_name = file.replace(".java", "")
                relative_path = os.path.relpath(os.path.join(root, file), source_dir)
                class_index[class_name] = os.path.join('src', 'main', 'java', relative_path)
    return class_index

def discover_dependencies(file_path: str, class_index: dict, base_package: str) -> list:
    """
    Reads a Java file and extracts its internal project dependencies
    by parsing the entire file for potential class usages.
    """
    dependencies = set() # Use a set to avoid duplicates
    try:
        with open(file_path, 'r', encoding='utf-8') as f:
            content = f.read()
            pattern = re.compile(r'\b[A-Z][a-zA-Z0-9]*\b')
            potential_classes = pattern.findall(content)
            
            for class_name in potential_classes:
                if class_name in class_index:
                    dependencies.add(class_index[class_name])

    except Exception as e:
        print(f"Warning: Could not parse dependencies for {file_path}: {e}")
        
    return sorted(list(dependencies))

def discover_classes_in_project(benchmark_path: str, output_file: str):
    """
    Scans a Maven project, finds all Java classes, and automatically
    discovers their internal dependencies to generate a scenarios file.
    """
    print(f"Discovering classes and dependencies in: {benchmark_path}...")
    scenarios = {}
    
    source_dir = os.path.join(benchmark_path, 'src', 'main', 'java')
    base_package = "org.springframework.samples.petclinic"

    if not os.path.exists(source_dir):
        print(f"Error: Source directory not found at {source_dir}")
        return

    # --- Pass 1: Build an index of all classes in the project ---
    class_index = build_class_index(source_dir)

    # --- Pass 2: Discover classes and their dependencies using the index ---
    for root, _, files in os.walk(source_dir):
        for file in files:
            if file.endswith(".java"):
                full_source_path = os.path.join(root, file)
                relative_path_from_src = os.path.relpath(full_source_path, source_dir)
                
                scenario_name = relative_path_from_src.replace(os.path.sep, '_').replace('.java', '').lower()
                
                relative_dir = os.path.dirname(relative_path_from_src)
                test_destination = os.path.join('src', 'test', 'java', relative_dir)
                
                # Discover dependencies for this specific file
                dependencies = discover_dependencies(full_source_path, class_index, base_package)
                
                # Ensure the main file isn't listed as its own dependency
                main_file_rel_path = os.path.join('src', 'main', 'java', relative_path_from_src)
                if main_file_rel_path in dependencies:
                    dependencies.remove(main_file_rel_path)

                scenarios[scenario_name] = {
                    "description": f"Unit test for the {file.replace('.java', '')} class.",
                    "files": [main_file_rel_path],
                    "dependencies": dependencies,
                    "test_destination": test_destination
                }

    with open(output_file, 'w') as f:
        json.dump(scenarios, f, indent=2)
        
    print(f"✅ Discovered {len(scenarios)} classes with their dependencies. Scenarios saved to '{output_file}'.")

if __name__ == '__main__':
    petclinic_path = os.path.join('benchmarks', 'spring-petclinic')
    discover_classes_in_project(petclinic_path, 'scenarios_petclinic.json')
