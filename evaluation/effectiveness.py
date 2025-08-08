import subprocess
import os
import shutil
import xml.etree.ElementTree as ET
import re
from config import Config

def check_compilation(test_code: str, class_name: str, benchmark_path: str, test_destination_dir: str) -> tuple[bool, str]:
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

def _compile_java_file(java_file_path: str, output_dir: str) -> tuple[bool, str]:
    """Compile a Java file and return success status and error message."""
    try:
        junit_jar_path = Config.JUNIT_JAR_PATH
        mockito_jar_path = Config.MOCKITO_JAR_PATH
        
        compile_result = subprocess.run(
            ['javac', '-cp', f"{junit_jar_path}:{mockito_jar_path}", java_file_path], 
            capture_output=True, text=True
        )
        
        success = compile_result.returncode == 0
        
        if not success:
            error_msg = f"Compilation failed: {compile_result.stderr}"
            print(error_msg)
            with open(os.path.join(output_dir, 'compilation_error.txt'), 'w') as f:
                f.write(f"STDOUT:\n{compile_result.stdout}\n\nSTDERR:\n{compile_result.stderr}\n\nRETURN CODE: {compile_result.returncode}")
        else:
            print("Compilation successful")
            
        return success, compile_result.stderr
        
    except Exception as e:
        error_msg = f"Compilation error: {e}"
        print(error_msg)
        return False, error_msg

def _run_java_tests_with_coverage(java_file_path: str, class_name: str, output_dir: str) -> bool:
    try:
        junit_jar_path = Config.JUNIT_JAR_PATH
        jacoco_agent_path = os.path.join('tools', 'jacocoagent.jar')
        jacoco_exec_path = os.path.join(output_dir, 'jacoco.exec')
        
        # Run tests with JaCoCo agent to collect coverage data
        mockito_jar_path = Config.MOCKITO_JAR_PATH
        class_path = f"{output_dir}{os.pathsep}{mockito_jar_path}"
        
        run_cmd = [
            'java',
            f'-javaagent:{jacoco_agent_path}=destfile={jacoco_exec_path}',
            '-jar', junit_jar_path,
            '--class-path', class_path,
            '--select-class', class_name
        ]
        
        result = subprocess.run(run_cmd, capture_output=True, text=True, timeout=30)
        success = result.returncode == 0 and "Test run finished" in result.stdout
        
        # Save test output
        with open(os.path.join(output_dir, 'test_output.txt'), 'w') as f:
            f.write(f"STDOUT:\n{result.stdout}\n\nSTDERR:\n{result.stderr}\n\nRETURN CODE: {result.returncode}")
        
        return success
        
    except subprocess.TimeoutExpired:
        print("Test execution timed out after 30 seconds")
        return False
    except Exception as e:
        print(f"Error running tests with coverage: {e}")
        return False

def _calculate_coverage_from_jacoco(output_dir: str, results: dict):
    """Calculate coverage metrics from JaCoCo execution data."""
    try:
        jacoco_exec_path = os.path.join(output_dir, 'jacoco.exec')
        jacoco_cli_path = os.path.join('tools', 'jacococli.jar')
        report_xml_path = os.path.join(output_dir, 'coverage.xml')
        
        report_cmd = [
            'java', '-jar', jacoco_cli_path, 'report', jacoco_exec_path,
            '--classfiles', output_dir,
            '--sourcefiles', output_dir, 
            '--xml', report_xml_path
        ]
        
        subprocess.run(report_cmd, check=True, capture_output=True)
        
        if os.path.exists(report_xml_path):
            tree = ET.parse(report_xml_path)
            root = tree.getroot()
            
            all_classes = []
            for pkg in root.findall("package"):
                for cls in pkg.findall("class"):
                    class_name = cls.get('name')
                    all_classes.append(class_name)
            
            for pkg in root.findall("package"):
                for cls in pkg.findall("class"):
                    if cls.get('name') == 'Solution':
                        for counter in cls.findall("counter[@type='LINE']"):
                            missed = int(counter.get('missed', '0'))
                            covered = int(counter.get('covered', '0'))
                            results['line_coverage'] = (covered / (missed + covered)) * 100 if (missed + covered) > 0 else 0
                        for counter in cls.findall("counter[@type='BRANCH']"):
                            missed = int(counter.get('missed', '0'))
                            covered = int(counter.get('covered', '0'))
                            results['branch_coverage'] = (covered / (missed + covered)) * 100 if (missed + covered) > 0 else 0
                        print(f"Found Solution class coverage: Line={results['line_coverage']:.2f}%, Branch={results['branch_coverage']:.2f}%")
                        return
            else:
                print(f"Warning: Solution class not found in coverage report. Available classes: {all_classes}")
        else:
            print("Warning: JaCoCo XML report not generated")
            
    except Exception as e:
        print(f"Error calculating coverage from JaCoCo: {e}")
        results['line_coverage'] = 0.0
        results['branch_coverage'] = 0.0

def analyze_humaneval_effectiveness(java_file_path: str, output_dir: str, class_name: str) -> dict:
    results = {
        "compiles": False, 
        "runs_successfully": False,
        "line_coverage": 0.0,
        "branch_coverage": 0.0
    }
    
    try:
        compiles_successfully, error_msg = _compile_java_file(java_file_path, output_dir)
        results["compiles"] = compiles_successfully
        
        if not compiles_successfully:
            return results
        
        tests_successful = _run_java_tests_with_coverage(java_file_path, class_name, output_dir)
        results["runs_successfully"] = tests_successful
        
        _calculate_coverage_from_jacoco(output_dir, results)
            
    except Exception as e:
        print(f"An unexpected error occurred in HumanEval evaluation: {e}")
        with open(os.path.join(output_dir, 'evaluation_error.txt'), 'w') as f:
            f.write(f"Error: {str(e)}")
    
    return results