#!/usr/bin/env python3

import os
import re
import sys
from database import init_db, add_correction_distance, update_experiment_correction_distance, get_all_experiments
from evaluation.maintainability import calculate_correction_distance

RESULTS_DIR = "outputs"
FOLDER_PREFIX = "llama3-70b-8192"
FAILED_FILE_NAME = "attempt_2.java"
CORRECTED_FILE_NAMES = ["Corrected_attempt.java", "Corrected_attemp.java"]

def extract_class_name_from_file(file_path):
    try:
        with open(file_path, 'r', encoding='utf-8') as f:
            content = f.read()
            
        match = re.search(r'public\s+class\s+(\w+)', content)
        if match:
            return match.group(1)
        
        match = re.search(r'class\s+(\w+)', content)
        if match:
            return match.group(1)
            
    except Exception as e:
        print(f"Error reading file {file_path}: {e}")
    
    return None

def extract_experiment_id_from_folder(folder_name):
    if folder_name.startswith(FOLDER_PREFIX):
        return folder_name
    return None

def find_corrected_file(folder_path):
    for corrected_name in CORRECTED_FILE_NAMES:
        corrected_path = os.path.join(folder_path, corrected_name)
        if os.path.exists(corrected_path):
            return corrected_path
    return None

def validate_experiment_folder(experiment_folder, full_folder_path, experiment_ids):
    corrected_file_path = find_corrected_file(full_folder_path)
    if not corrected_file_path:
        return None, f"No corrected file found in: {experiment_folder}"
    
    original_file_path = os.path.join(full_folder_path, FAILED_FILE_NAME)
    if not os.path.exists(original_file_path):
        return None, f"No {FAILED_FILE_NAME} found in: {experiment_folder}"
    
    class_name = extract_class_name_from_file(corrected_file_path)
    if not class_name:
        return None, f"Could not extract class name from: {corrected_file_path}"
    
    experiment_id = extract_experiment_id_from_folder(experiment_folder)
    if not experiment_id:
        return None, f"Could not extract experiment ID from: {experiment_folder}"
    
    if experiment_id not in experiment_ids:
        return None, f"Experiment ID not found in database: {experiment_id}"
    
    return {
        'corrected_file_path': corrected_file_path,
        'original_file_path': original_file_path,
        'class_name': class_name,
        'experiment_id': experiment_id
    }, None

def calculate_and_store_correction_distances():
    print(f"--- Calculating Correction Distances ---")
    print(f"Scanning directory: '{RESULTS_DIR}' for folders starting with '{FOLDER_PREFIX}'\n")

    if not os.path.exists(RESULTS_DIR):
        print(f"Error: The directory '{RESULTS_DIR}' was not found.")
        return

    init_db()
    
    experiments = get_all_experiments()
    experiment_ids = {exp['experiment_id'] for exp in experiments}
    
    found_pairs = 0
    stored_distances = 0
    
    for experiment_folder in os.listdir(RESULTS_DIR):
        if experiment_folder.startswith(FOLDER_PREFIX):
            full_folder_path = os.path.join(RESULTS_DIR, experiment_folder)
            
            if os.path.isdir(full_folder_path):
                validation_result, error = validate_experiment_folder(experiment_folder, full_folder_path, experiment_ids)
                
                if error:
                    print(error)
                    continue
                
                found_pairs += 1
                print(f"Processing: {experiment_folder}")
                print(f"  Class name: {validation_result['class_name']}")
                print(f"  Experiment ID: {validation_result['experiment_id']}")
                
                distance = calculate_correction_distance(validation_result['original_file_path'], validation_result['corrected_file_path'])
                
                if distance >= 0:
                    print(f"  Correction Distance: {distance:.4f} ({distance:.2%})")
                    
                    correction_data = {
                        'experiment_id': validation_result['experiment_id'],
                        'original_file_path': validation_result['original_file_path'],
                        'corrected_file_path': validation_result['corrected_file_path'],
                        'correction_distance': distance,
                        'class_name': validation_result['class_name']
                    }
                    
                    try:
                        add_correction_distance(correction_data)
                        update_experiment_correction_distance(validation_result['experiment_id'], distance)
                        stored_distances += 1
                        print(f"  ✓ Stored in database\n")
                    except Exception as e:
                        print(f"  ✗ Error storing in database: {e}\n")
                else:
                    print(f"  ✗ Error calculating distance\n")
    
    print(f"--- Summary ---")
    print(f"Found file pairs: {found_pairs}")
    print(f"Successfully stored distances: {stored_distances}")
    
    if found_pairs == 0:
        print("No matching pairs of files were found.")

def main():
    try:
        calculate_and_store_correction_distances()
    except Exception as e:
        print(f"Error: {e}")
        sys.exit(1)

if __name__ == "__main__":
    main()
