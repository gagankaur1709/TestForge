# discover_humaneval.py
import json
import os
import re

def discover_humaneval_scenarios(benchmark_path: str, output_file: str):
    """
    Parses the HumanEval-X .jsonl file and creates a scenarios JSON file
    with a structure optimized for this benchmark.
    """
    print(f"Discovering scenarios in: {benchmark_path}...")
    scenarios = {}
    # Corrected the filename based on the actual file in the benchmark
    humaneval_file = os.path.join(benchmark_path, 'test.jsonl')

    if not os.path.exists(humaneval_file):
        print(f"Error: HumanEval-X file not found at {humaneval_file}")
        return

    with open(humaneval_file, 'r') as f:
        for line in f:
            data = json.loads(line)
            # Use the task_id as the unique key for the scenario
            task_id = data['task_id'].replace('/', '_')

            # --- This is the new, cleaner scenario structure ---
            # It directly uses the fields provided in the dataset.
            scenarios[task_id] = {
                "task_id": data['task_id'],
                "prompt": data['prompt'],               # Input for the LLM
                "canonical_solution": data['canonical_solution'], # Reference for analysis
                "test_code": data['test']                # The evaluation oracle
            }
            # --- End of new structure ---

    with open(output_file, 'w') as f:
        json.dump(scenarios, f, indent=2)
        
    print(f"Discovered {len(scenarios)} scenarios. Saved to '{output_file}'.")

if __name__ == '__main__':
    humaneval_path = os.path.join('benchmark', 'humaneval-x')
    discover_humaneval_scenarios(humaneval_path, 'scenarios_humaneval.json')