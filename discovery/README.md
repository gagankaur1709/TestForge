# Discovery Package

This package contains scripts for automatically discovering and generating test scenarios from different benchmark types.

## Files

### `discover_classes.py`
Automatically discovers Java classes in a Maven project and generates test scenarios with dependencies.

**Usage:**
```python
from discovery import discover_classes_in_project

# Discover classes in Spring PetClinic project
discover_classes_in_project(
    benchmark_path='benchmark/spring-petclinic',
    output_file='scenarios_spring-petclinic.json'
)
```

**Features:**
- Scans entire source directory for Java classes
- Automatically detects internal dependencies between classes
- Generates test destination paths
- Creates comprehensive scenario definitions

### `discover_humaneval.py`
Parses HumanEval-X benchmark files and creates scenarios for code generation tasks.

**Usage:**
```python
from discovery import discover_humaneval_scenarios

# Discover HumanEval scenarios
discover_humaneval_scenarios(
    benchmark_path='benchmark/humaneval-x',
    output_file='scenarios_humaneval.json'
)
```

**Features:**
- Parses HumanEval-X JSONL format
- Extracts task prompts, canonical solutions, and test code
- Creates scenarios optimized for LLM code generation

## Generated Scenario Format

### Spring PetClinic Scenarios
```json
{
  "org_springframework_samples_petclinic_vet_vetcontroller": {
    "description": "Unit test for the VetController class.",
    "files": ["src/main/java/org/springframework/samples/petclinic/vet/VetController.java"],
    "dependencies": [
      "src/main/java/org/springframework/samples/petclinic/vet/Vet.java",
      "src/main/java/org/springframework/samples/petclinic/vet/VetRepository.java"
    ],
    "test_destination": "src/test/java/org/springframework/samples/petclinic/vet"
  }
}
```

### HumanEval Scenarios
```json
{
  "HumanEval_1": {
    "task_id": "HumanEval/1",
    "prompt": "def has_close_elements(numbers, threshold):\n    \"\"\"...",
    "canonical_solution": "def has_close_elements(numbers, threshold):\n    ...",
    "test_code": "def check(candidate):\n    ..."
  }
}
```

## Running Discovery Scripts

You can run the discovery scripts directly:

```bash
# Discover Spring PetClinic classes
python discovery/discover_classes.py

# Discover HumanEval scenarios
python discovery/discover_humaneval.py
```

Or import and use them programmatically:

```python
from discovery import discover_classes_in_project, discover_humaneval_scenarios

# Your discovery logic here
```
