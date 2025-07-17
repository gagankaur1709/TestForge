# evaluation/effectiveness.py

import subprocess
import os
import shutil
import xml.etree.ElementTree as ET

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
    success, output = run_maven_command(['mvn', 'clean', 'verify'], working_dir=benchmark_path)
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

