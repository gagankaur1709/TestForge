from database import add_experiment_result

dummy_experiment = {
    'experiment_id': 'dummy_001',
    'generator_name': 'Gemini-Pro',
    'prompt_strategy': 'chain_of_thought',
    'benchmark_name': 'spring-petclinic',
    'compiles': True,
    'runs_successfully': True,
    'fault_detected': False,
    'line_coverage': 85.5,
    'branch_coverage': 75.0,
    'cyclomatic_complexity': 3,
    'cognitive_complexity': 2,
    'coupling_between_objects': 1,
    'test_brittleness_score': 0,
    'time_cost': 12.34,
    'token_cost': 1234,
    'output_path': 'outputs/dummy_001'
}

add_experiment_result(dummy_experiment)
print("Dummy experiment added!")
