# tests/test_randoop_generator.py

import sys
import os
import unittest
import subprocess

# This makes sure the script can find your other project files
sys.path.insert(0, os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from generator.randoop_generator import RandoopGenerator
from config import Config

class TestRandoopGenerator(unittest.TestCase):

    def setUp(self):
        """
        This method runs before the test. It sets up the configuration.
        """
        self.benchmark_path = os.path.join(Config.BENCHMARK_DIR, 'spring-petclinic')
        
        # --- IMPORTANT: Ensure your Maven build is up-to-date ---
        # Randoop needs the compiled classes of the benchmark project.
        # We'll run 'mvn dependency:copy-dependencies' to get all jars.
        print("Ensuring benchmark dependencies are ready...")
        subprocess.run(
            ["mvn", "dependency:copy-dependencies"], 
            cwd=self.benchmark_path, 
            capture_output=True
        )
        
        self.config = {
            "RANDOOP_JAR_PATH": Config.RANDOOP_JAR_PATH,
            "BENCHMARK_DIR": self.benchmark_path
        }

    def test_randoop_generation(self):
        """
        The main test case that runs the Randoop generator and checks the output.
        """
        print("\n--- Starting Test for RandoopGenerator ---")

        # 1. Instantiate the generator
        try:
            randoop_gen = RandoopGenerator(config=self.config)
            print("RandoopGenerator instantiated successfully.")
        except Exception as e:
            self.fail(f"Failed to instantiate RandoopGenerator: {e}")

        # 2. Define the fully qualified class name to test
        # Use a simple model class to ensure a quick run.
        class_to_test = "org.springframework.samples.petclinic.model.Person"

        print(f"\nGenerating tests for class: '{class_to_test}'...")

        # 3. Call the generate method
        # The prompt and model_name arguments are ignored by this generator
        generated_code = randoop_gen.generate(
            code_context=class_to_test,
            prompt_strategy="", # Pass empty strings for optional params
            model_name=""
        )

        # 4. Print and check the result
        print("\n--- Generated Code Snippet (first 500 chars) ---")
        if "Error:" in generated_code:
            self.fail(f"An error occurred: {generated_code}")
        else:
            print(generated_code[:500] + "...")
        print("\n--- End of Test ---")

        # 5. Add assertions to verify the output
        self.assertNotIn("Error:", generated_code, "The generation process should not return an error.")
        self.assertIsInstance(generated_code, str, "The output should be a string.")
        self.assertGreater(len(generated_code), 0, "The generated code should not be empty.")
        self.assertIn("@Test", generated_code, "The generated code should contain JUnit @Test annotations.")
        self.assertIn("RegressionTest", generated_code, "The generated code should contain Randoop's RegressionTest class.")

# This allows you to run the test directly from the command line
if __name__ == '__main__':
    unittest.main()
