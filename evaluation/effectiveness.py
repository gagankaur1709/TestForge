import subprocess
import os
import shutil
import xml.etree.ElementTree as ET
import re
from config import Config

def check_compilation(test_code: str, class_name: str, benchmark_path: str, test_destination_dir: str) -> tuple[bool, str]:
    """
    Checks if the provided test code compiles within the benchmark project.

    Args:
        test_code: The string content of the generated Java test.
        class_name: The name of the test class (e.g., "GeneratedOwnerTest").
        benchmark_path: The root path of the benchmark project.

    Returns:
        A tuple: (compiles_successfully: bool, build_log: str)
    """

    test_filename = f"{class_name}.java"
    destination_path = os.path.join(test_destination_dir, test_filename)
    os.makedirs(test_destination_dir, exist_ok=True)

    with open(destination_path, 'w') as f:
        f.write(test_code)
    success, output = run_maven_command(['mvn', 'test-compile'], working_dir=benchmark_path)

    os.remove(destination_path)

    return success, output


def run_maven_command(command: list, working_dir: str) -> tuple[bool, str]:
    try:
        process = subprocess.run(command, cwd=working_dir, check=True, capture_output=True, text=True, shell=False)
        return True, process.stdout + "\n" + process.stderr
    except subprocess.CalledProcessError as e:
        error_output = f"Maven command failed with exit code {e.returncode}\nStdout:\n{e.stdout}\nStderr:\n{e.stderr}\n"
        return False, error_output
    except FileNotFoundError:
        return False, "Error: 'mvn' command not found. Is Maven installed and in your PATH?"

def analyze_effectiveness(test_file_path: str, benchmark_path: str, output_dir: str) -> dict:
    """
    Analyzes the effectiveness of a generated test suite.
    This function is now a pure analysis step.
    """
    results = {
        "compiles": False,
        "runs_successfully": False,
        "fault_detected": False, 
        "line_coverage": 0.0,
        "branch_coverage": 0.0
    }

    test_filename = os.path.basename(test_file_path)
    test_destination_dir = os.path.join(benchmark_path, 'src', 'test', 'java', 'org', 'springframework', 'samples', 'petclinic', 'model')
    os.makedirs(test_destination_dir, exist_ok=True)
    destination_path = os.path.join(test_destination_dir, test_filename)
    shutil.copyfile(test_file_path, destination_path)

    run_maven_command(['mvn', 'spring-javaformat:apply'], working_dir=benchmark_path)
    success, output = run_maven_command(['mvn', 'verify'], working_dir=benchmark_path)

    with open(os.path.join(output_dir, 'build_log.txt'), 'w') as f:
        f.write(output)
    os.remove(destination_path)

    if not success:
        print("Build or test run failed.")
        return results

    results["compiles"] = True
    results["runs_successfully"] = "BUILD SUCCESS" in output
    
    jacoco_report_path = os.path.join(benchmark_path, 'target', 'site', 'jacoco', 'jacoco.xml')
    if os.path.exists(jacoco_report_path):
        shutil.copy(jacoco_report_path, os.path.join(output_dir, 'jacoco.xml'))
        try:
            tree = ET.parse(jacoco_report_path)
            root = tree.getroot()
            for counter in root.findall("counter[@type='LINE']"):
                missed, covered = int(counter.get('missed', '0')), int(counter.get('covered', '0'))
                results['line_coverage'] = (covered / (missed + covered)) * 100 if (missed + covered) > 0 else 0
            for counter in root.findall("counter[@type='BRANCH']"):
                missed, covered = int(counter.get('missed', '0')), int(counter.get('covered', '0'))
                results['branch_coverage'] = (covered / (missed + covered)) * 100 if (missed + covered) > 0 else 0
        except Exception as e:
            print(f"Error parsing JaCoCo report: {e}")

    return results

def analyze_humaneval_effectiveness(generated_test_code: str, scenario: dict, output_dir: str, class_name: str) -> dict:
    """
    A simple pipeline to compile and run a generated HumanEval solution file.
    The LLM should now generate complete, compilable Java files.
    """
    results = {"compiles": False, "runs_successfully": False}
    
    solution_code = f"""
    {scenario['prompt']}
    {scenario['canonical_solution']}
    """

    imports_from_solution = re.findall(r'import\s+[\w\.\*]+;', scenario['prompt'])
    imports_from_llm = re.findall(r'import\s+[\w\.\*]+;', generated_test_code)
    print(imports_from_solution)
    all_imports = sorted(list(set(imports_from_solution + imports_from_llm)))
    import_block = "\n".join(all_imports)
    test_class_code = re.sub(r'import\s+(?:static\s+)?[\w\.\*]+;', '', generated_test_code).strip()

    full_java_code = f"""
    {import_block}
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
    {solution_code}
    {test_class_code}
    """

    java_file_path = os.path.join(output_dir, f"{class_name}.java")
    with open(java_file_path, 'w', encoding='utf-8') as f:
        f.write(full_java_code)


    try:
        junit_jar_path = Config.JUNIT_JAR_PATH
        mockito_jar_path = Config.MOCKITO_JAR_PATH
        # Instead of renaming, compile the original file directly
        compile_result = subprocess.run(
            ['javac', '-cp', f"{junit_jar_path}:{mockito_jar_path}", java_file_path], 
            capture_output=True, text=True
        )

        results["compiles"] = compile_result.returncode == 0
        
        if compile_result.returncode != 0:
            print(f"Compilation failed: {compile_result.stderr}")
            with open(os.path.join(output_dir, 'compilation_error.txt'), 'w') as f:
                f.write(f"STDOUT:\n{compile_result.stdout}\n\nSTDERR:\n{compile_result.stderr}\n\nRETURN CODE: {compile_result.returncode}")
            return results
        print(f"Compilation successful")
        results["compiles"] = True
        
        try:
            class_path = f"{os.path.dirname(java_file_path)}{os.pathsep}{mockito_jar_path}"
            result = subprocess.run(
            ['java', '-jar', junit_jar_path, '--class-path', class_path, '--select-class', class_name],
            capture_output=True, text=True, timeout=30
            )
            results["runs_successfully"] = result.returncode == 0 and "Test run finished" in result.stdout
            with open(os.path.join(output_dir, 'test_output.txt'), 'w') as f:
                f.write(f"STDOUT:\n{result.stdout}\n\nSTDERR:\n{result.stderr}\n\nRETURN CODE: {result.returncode}")
        
                
        except subprocess.TimeoutExpired:
            print("Test execution timed out after 30 seconds")
            results["runs_successfully"] = False
        except Exception as e:
            print(f"Error running tests: {e}")
            results["runs_successfully"] = False

    except Exception as e:
        print(f"An unexpected error occurred in HumanEval evaluation: {e}")
        with open(os.path.join(output_dir, 'evaluation_error.txt'), 'w') as f:
            f.write(f"Error: {str(e)}")

    return results