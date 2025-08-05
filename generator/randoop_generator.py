import os
import subprocess
import shutil
from typing import Optional
from .baseGenerator import TestGenerator

class RandoopGenerator(TestGenerator):
    """
    A concrete implementation of TestGenerator that runs the Randoop tool.
    This provides a feedback-directed random testing baseline.
    """

    def generate(self, code_context: str, prompt_strategy: Optional[str] = None, model_name: Optional[str] = None) -> str:
        class_to_test = code_context
        randoop_jar_path = self.config.get("RANDOOP_JAR_PATH")
        benchmark_path = self.config.get("BENCHMARK_DIR")

        if not all([class_to_test, randoop_jar_path, benchmark_path]):
            return "Error: Missing configuration for Randoop."

        output_dir = os.path.join(benchmark_path, "randoop-tests")
        os.makedirs(output_dir, exist_ok=True)

        classes_path = os.path.join(benchmark_path, 'target', 'classes')
        dependency_path = os.path.join(benchmark_path, 'target', 'dependency')

        classpath_jars = [randoop_jar_path, classes_path]
        if os.path.exists(dependency_path):
            for jar_file in os.listdir(dependency_path):
                if jar_file.endswith('.jar'):
                    classpath_jars.append(os.path.join(dependency_path, jar_file))
        
        classpath = os.pathsep.join(classpath_jars)

        command = [
            'java',
            '-classpath', classpath, # Use the complete, explicit classpath
            'randoop.main.Main',
            'gentests',
            f'--testclass={class_to_test}',
            f'--junit-output-dir={output_dir}'
        ]

        print(f"Running Randoop command: {' '.join(command)}")

        try:
            subprocess.run(command, check=True, capture_output=True, text=True, timeout=180)

            generated_code = ""
            regression_test_file = "RegressionTest0.java"
            if os.path.exists(output_dir):
                for file in os.listdir(output_dir):
                    if file == regression_test_file:
                        with open(os.path.join(output_dir, file), 'r', encoding='utf-8') as f:
                            generated_code = f.read()
                        break
            
            if not generated_code:
                return "Error: Randoop ran but did not produce any test files."

            return generated_code

        except subprocess.TimeoutExpired as e:
            return f"Error: Randoop execution timed out.\n---STDERR---\n{e.stderr}\n---STDOUT---\n{e.stdout}"
        except subprocess.CalledProcessError as e:
            return f"Randoop failed with an error:\n---STDERR---\n{e.stderr}\n---STDOUT---\n{e.stdout}"
        finally:
            if os.path.exists(output_dir):
                shutil.rmtree(output_dir)
                print(f"Cleaned up Randoop output directory: {output_dir}")
