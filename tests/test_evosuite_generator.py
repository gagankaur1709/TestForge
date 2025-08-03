# tests/test_evosuite_generator.py

import sys
import os
import unittest

sys.path.insert(0, os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from generator.evosuite_generator import EvoSuiteGenerator
from config import Config

class TestEvoSuiteGenerator(unittest.TestCase):

    def setUp(self):
        """
        This method runs before the test. It sets up the configuration.
        """
        self.benchmark_path = os.path.join(Config.BENCHMARK_DIR, 'spring-petclinic')
        
        # --- IMPORTANT: Ensure your Maven build is up-to-date ---
        # EvoSuite needs the compiled classes of the benchmark project.
        # Run 'mvn clean install' in the 'benchmarks/spring-petclinic' directory once
        # before running this test to make sure the target/classes folder exists.
        
        self.config = {
            "EVOSUITE_JAR_PATH": Config.EVOSUITE_JAR_PATH,
            "BENCHMARK_DIR": self.benchmark_path
        }

    def test_evosuite_generation(self):
        """
        The main test case that runs the EvoSuite generator and checks the output.
        """
        print("\n--- Starting Test for EvoSuiteGenerator ---")

        # 1. Instantiate the generator
        try:
            evosuite_gen = EvoSuiteGenerator(config=self.config)
            print("EvoSuiteGenerator instantiated successfully.")
        except Exception as e:
            self.fail(f"Failed to instantiate EvoSuiteGenerator: {e}")

        # 2. Define the fully qualified class name to test
        # This is what EvoSuite uses as its main input.
        class_to_test = "org.springframework.samples.petclinic.model.Person"

        print(f"\nGenerating tests for class: '{class_to_test}'...")

        # 3. Call the generate method
        # The prompt and model_name arguments are ignored by this generator
        generated_code = evosuite_gen.generate(
            code_context=class_to_test,
            prompt_strategy = None,
            model_name = None
        )

        # 4. Print and check the result
        print("\n--- Generated Code Snippet (first 500 chars) ---")
        if "Error:" in generated_code:
            print(f"An error occurred: {generated_code}")
        else:
            print(generated_code[:500] + "...")
        print("\n--- End of Test ---")

        # 5. Add assertions to verify the output
        self.assertNotIn("Error:", generated_code, "The generation process should not return an error.")
        self.assertIsInstance(generated_code, str, "The output should be a string.")
        self.assertGreater(len(generated_code), 0, "The generated code should not be empty.")
        self.assertIn("@Test", generated_code, "The generated code should contain JUnit @Test annotations.")
        self.assertIn("package org.springframework.samples.petclinic.model;", generated_code, "The package declaration should be present.")

# This allows you to run the test directly from the command line
if __name__ == '__main__':
    unittest.main()
