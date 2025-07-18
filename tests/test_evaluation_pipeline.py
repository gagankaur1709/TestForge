# tests/test_evaluation_pipeline.py
import os
import shutil
import unittest
import textwrap

from evaluation.effectiveness import analyze_effectiveness
from evaluation.maintainability import analyze_maintainability
from config import Config

class TestEvaluationPipeline(unittest.TestCase):

    def setUp(self):
        self.pmd_path = "/Users/gagan/tools/pmd-bin-7.15.0"
        self.ruleset_path = "rulesets/maintainability_rules.xml"
        self.benchmark_path = os.path.join(Config.BENCHMARK_DIR, 'spring-petclinic')
        self.test_output_dir = "temp_test_outputs"
        os.makedirs(self.test_output_dir, exist_ok=True)

        self.sample_test_code = textwrap.dedent("""
        package org.springframework.samples.petclinic.model;

        import org.junit.jupiter.api.Test;
        import static org.junit.jupiter.api.Assertions.*;
        import org.springframework.samples.petclinic.owner.Owner;
        /**
        * A sample test class to verify the evaluation pipeline.
        */
        class GeneratedOwnerTest {

            @Test
            void testOwnerProperties() {
                Owner owner = new Owner();
                String firstName = "George";
                String lastName = "Franklin";

                owner.setFirstName(firstName);
                owner.setLastName(lastName);

                assertEquals(firstName, owner.getFirstName(), "First name should match.");
                assertEquals(lastName, owner.getLastName(), "Last name should match.");
            }

            @Test
            void testComplexLogic() {
                int x = 10;
                int y = 20;
                if (x > 5) {
                    assertTrue(true);
                    if (y > 15) {
                        assertEquals(20, y);
                    }
                } else {
                    fail("This branch should not be hit.");
                }
            }
        }
        """)
        self.test_file_path = os.path.join(self.test_output_dir, "GeneratedOwnerTest.java")
        with open(self.test_file_path, "w") as f:
            f.write(self.sample_test_code)

    def tearDown(self):
        shutil.rmtree(self.test_output_dir)

    def test_analyzers(self):
        print("\n--- Testing Effectiveness Analyzer ---")
        effectiveness_results = analyze_effectiveness(
            self.test_file_path, 
            self.benchmark_path,
            self.test_output_dir
        )
        print("Effectiveness Results:", effectiveness_results)

        self.assertTrue(effectiveness_results['compiles'])
        self.assertTrue(effectiveness_results['runs_successfully'])
        self.assertGreater(effectiveness_results['line_coverage'], 0)


        print("\n--- Testing Maintainability Analyzer ---")
        maintainability_results = analyze_maintainability(
            self.test_file_path, 
            self.pmd_path, 
            self.ruleset_path
        )
        print("Maintainability Results:", maintainability_results)
        self.assertGreaterEqual(maintainability_results['cyclomatic_complexity'], 3)

        print("\n--- Evaluation Pipeline Test Finished ---")

if __name__ == '__main__':
    unittest.main()

