# test_db.py

import sys
import os
# Add the parent directory to the Python path so we can import modules from the root
sys.path.append(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from database import init_db, add_experiment_result, get_all_experiments

def run_db_test():
    """
    A simple script to test the database connection and functions.
    It initializes the DB, adds one sample record, and then reads it back.
    """
    print("--- Starting Database Connection Test ---")

    # Ensure the /data directory exists
    if not os.path.exists('data'):
        os.makedirs('data')

    # 1. Initialize the database (creates the file and table if they don't exist)
    try:
        init_db()
    except Exception as e:
        print(f"Error during database initialization: {e}")
        return

    # 2. Create a dictionary with some sample data for a test experiment
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

    # 3. Add the sample data to the database
    try:
        print("\nAttempting to add a sample record...")
        add_experiment_result(sample_result)
    except Exception as e:
        print(f"Error adding experiment result to database: {e}")
        return

    # 4. Read all data back from the database to confirm it was saved
    try:
        print("\nReading all records from the database...")
        all_experiments = get_all_experiments()
        
        if not all_experiments:
            print("No records found in the database.")
        else:
            print(f"Found {len(all_experiments)} record(s).")
            for exp in all_experiments:
                # Print the unique ID of the record found
                print(f"  - ID: {exp['id']}, Experiment_ID: {exp['experiment_id']}")

    except Exception as e:
        print(f"Error reading from database: {e}")
        return

    print("\n--- Database Test Finished ---")
    print(f"You can now open 'data/experiments.db' with DB Browser for SQLite to verify.")


if __name__ == "__main__":
    run_db_test()
