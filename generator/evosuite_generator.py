
import os
import subprocess
import shutil
from typing import Optional
from .baseGenerator import TestGenerator

class EvoSuiteGenerator(TestGenerator):

    def generate(self, code_context: str, prompt_strategy: Optional[str] = None, model_name: Optional[str] = None) -> str:
        class_to_test = code_context 
        evosuite_jar_path = self.config.get("EVOSUITE_JAR_PATH")
        benchmark_path = self.config.get("BENCHMARK_DIR")
        
        if not all([class_to_test, evosuite_jar_path, benchmark_path]):
            return "Error: Missing configuration for EvoSuite."
        
        if not evosuite_jar_path:
            return "Error: EVOSUITE_JAR_PATH is not provided in the configuration."

        if not benchmark_path:
            return "Error: BENCHMARK_PATH is not provided in the configuration."

        if not class_to_test:
            return "Error: Class to test was not provided in the code_context."

        output_dir = os.path.join(benchmark_path, "evosuite-tests")

        command = [
            'java',
            '--add-opens', 'java.desktop/java.awt=ALL-UNNAMED',
            '-Xms512m',
            '-Xmx1024m',
            '-jar', evosuite_jar_path,
            '-class', class_to_test,
            '-projectCP', os.path.join(benchmark_path, 'target', 'classes'),
            '-Dtest_dir=' + output_dir
        ]

        print(f"Running EvoSuite command: {' '.join(command)}")

        try:
            # We will capture the process result directly
            process = subprocess.run(
                command, 
                capture_output=True, 
                text=True, 
                timeout=180,
                check=True # This will still raise an error if the process fails
            )

            # --- Read and Concatenate All Generated Test Files ---
            all_generated_code = []
            if os.path.exists(output_dir):
                for root, _, files in os.walk(output_dir):
                    for file in files:
                        if file.endswith(".java"):
                            with open(os.path.join(root, file), 'r', encoding='utf-8') as f:
                                all_generated_code.append(f.read())
            
            if not all_generated_code:
                return f"Error: EvoSuite ran successfully but did not produce any test files.\nLog:\n{process.stdout}\n{process.stderr}"

            return "\n\n".join(all_generated_code)

        except subprocess.TimeoutExpired as e:
            # --- THIS IS THE FIX ---
            # Return a detailed message including stdout and stderr for timeouts
            log_message = f"Error: EvoSuite execution timed out.\n"
            log_message += f"--- STDOUT ---\n{e.stdout}\n"
            log_message += f"--- STDERR ---\n{e.stderr}\n"
            return log_message
            
        except subprocess.CalledProcessError as e:
            # --- THIS IS THE FIX ---
            # Return a detailed message including stdout and stderr for other errors
            log_message = f"EvoSuite failed with an error.\n"
            log_message += f"--- STDOUT ---\n{e.stdout}\n"
            log_message += f"--- STDERR ---\n{e.stderr}\n"
            return log_message
            
        finally:
            if os.path.exists(output_dir):
                shutil.rmtree(output_dir)
                print(f"Cleaned up EvoSuite output directory: {output_dir}")
