# test_correction_distance.py

import os
import sys
from evaluation.maintainability import calculate_correction_distance


RESULTS_DIR = "pilot_study_results/outputs" 
FOLDER_PREFIX = "llama3-70b-8192"
FAILED_FILE_NAME = "FailedTest_attempt_1.java"
CORRECTED_FILE_NAME = "Corrected_attempt_1.java"

def test_distance_calculation():
    print(f"--- Testing Correction Distance Calculation ---")
    print(f"Scanning directory: '{RESULTS_DIR}' for folders starting with '{FOLDER_PREFIX}'\n")

    if not os.path.exists(RESULTS_DIR):
        print(f"Error: The directory '{RESULTS_DIR}' was not found.")
        return

    found_any = False
    for experiment_folder in os.listdir(RESULTS_DIR):
        if experiment_folder.startswith(FOLDER_PREFIX):
            full_folder_path = os.path.join(RESULTS_DIR, experiment_folder)

            if os.path.isdir(full_folder_path):
                original_file_path = os.path.join(full_folder_path, FAILED_FILE_NAME)
                corrected_file_path = os.path.join(full_folder_path, CORRECTED_FILE_NAME)

                if os.path.exists(original_file_path) and os.path.exists(corrected_file_path):
                    found_any = True
                    print(f"Found file pair in: {experiment_folder}")
                    distance = calculate_correction_distance(original_file_path, corrected_file_path)
                    
                    if distance >= 0:
                        print(f"  => Correction Distance: {distance:.2%}\n")
                    else:
                        print(f"  => Error calculating distance for this pair.\n")

    if not found_any:
        print("No matching pairs of 'FailedTest_attempt_1.java' and 'Corrected_attempt_1.java' were found.")

if __name__ == "__main__":
    sys.path.insert(0, os.path.abspath(os.path.dirname(__file__)))
    test_distance_calculation()

