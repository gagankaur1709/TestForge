# test_db.py

from database import init_db, add_experiment_result, get_all_experiments
import os

def run_db_test():
    print("--- Starting Database Connection Test ---")
    if not os.path.exists('data'):
        os.makedirs('data')
    try:
        init_db()
    except Exception as e:
        print(f"Error during database initialization: {e}")
        return

    sample_result = {
        'experiment_id': 'gemini-pro_test_run_01',
        'generator_name': 'Gemini-Pro',
        'prompt_strategy': 'Chain-of-Thought',
        'benchmark_name': 'TestBenchmark',
        'compiles': True,
        'runs_successfully': True,
        'fault_detected': False,
        'line_coverage': 85.5,
        'branch_coverage': 75.0,
        'cyclomatic_complexity': 5,
        'cognitive_complexity': 7,
        'coupling_between_objects': 3,
        'test_brittleness_score': 1,
        'time_cost': 12.34,
        'token_cost': 1500,
        'output_path': 'outputs/gemini-pro_test_run_01'
    }

    try:
        print("\nAttempting to add a sample record...")
        add_experiment_result(sample_result)
    except Exception as e:
        print(f"Error adding experiment result to database: {e}")
        return

    try:
        print("\nReading all records from the database...")
        all_experiments = get_all_experiments()
        
        if not all_experiments:
            print("No records found in the database.")
        else:
            print(f"Found {len(all_experiments)} record(s).")
            for exp in all_experiments:
                print(f"  - ID: {exp['id']}, Experiment_ID: {exp['experiment_id']}")

    except Exception as e:
        print(f"Error reading from database: {e}")
        return

    print("\n--- Database Test Finished ---")
    print(f"You can now open 'data/experiments.db' with DB Browser for SQLite to verify.")


if __name__ == "__main__":
    run_db_test()
