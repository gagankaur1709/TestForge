import os
import sys
from discovery import discover_classes_in_project, discover_humaneval_scenarios

def main():
    
    print("Discovery Package Demo")
    
    petclinic_path = os.path.join('benchmark', 'spring-petclinic')
    humaneval_path = os.path.join('benchmark', 'humaneval-x')
    
    if os.path.exists(petclinic_path):
        print("\nDiscovering Spring PetClinic classes...")
        try:
            discover_classes_in_project(petclinic_path, 'scenarios_spring-petclinic.json')
            print("Spring PetClinic scenarios generated successfully!")
        except Exception as e:
            print(f"Error discovering PetClinic classes: {e}")
    else:
        print(f"PetClinic benchmark not found at {petclinic_path}")
    
    if os.path.exists(humaneval_path):
        print("\nDiscovering HumanEval scenarios...")
        try:
            discover_humaneval_scenarios(humaneval_path, 'scenarios_humaneval.json')
            print("HumanEval scenarios generated successfully!")
        except Exception as e:
            print(f"Error discovering HumanEval scenarios: {e}")
    else:
        print(f"HumanEval benchmark not found at {humaneval_path}")
    
    print("\n Discovery process completed!")
    print("\nGenerated files:")
    if os.path.exists('scenarios_spring-petclinic.json'):
        print("  - scenarios_spring-petclinic.json")
    if os.path.exists('scenarios_humaneval.json'):
        print("  - scenarios_humaneval.json")

if __name__ == '__main__':
    main()
