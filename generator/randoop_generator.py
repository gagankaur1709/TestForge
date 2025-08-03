# generators/randoop_generator.py

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

        # Randoop needs a full classpath, including the project's compiled
        # classes and all of its dependencies.
        classpath = f"{os.path.join(benchmark_path, 'target', 'classes')}:{os.path.join(benchmark_path, 'target', 'dependency', '*')}"

        command = [
            'java',
            '-classpath', f"{randoop_jar_path}:{classpath}",
            'randoop.main.Main',
            'gentests',
            f'--testclass={class_to_test}',
            f'--junit-output-dir={output_dir}',
            '--time-limit=120' # 2-minute time limit
        ]

        print(f"Running Randoop command: {' '.join(command)}")

        try:
            subprocess.run(command, check=True, capture_output=True, text=True, timeout=180)

            all_generated_code = []
            if os.path.exists(output_dir):
                for file in os.listdir(output_dir):
                    if file.endswith(".java"):
                        with open(os.path.join(output_dir, file), 'r', encoding='utf-8') as f:
                            all_generated_code.append(f.read())
            
            if not all_generated_code:
                return "Error: Randoop ran but did not produce any test files."

            return "\n\n".join(all_generated_code)

        except subprocess.TimeoutExpired as e:
            return f"Error: Randoop execution timed out.\n---STDERR---\n{e.stderr}\n---STDOUT---\n{e.stdout}"
        except subprocess.CalledProcessError as e:
            return f"Randoop failed with an error:\n---STDERR---\n{e.stderr}\n---STDOUT---\n{e.stdout}"
        finally:
            if os.path.exists(output_dir):
                shutil.rmtree(output_dir)
                print(f"Cleaned up Randoop output directory: {output_dir}")
