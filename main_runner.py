from run_experiment import run_experiment
from database import init_db
from config import Config
import os
import subprocess
import json
from discovery import discover_classes_in_project

# Define the LLM providers and models to test
LLM_PROVIDERS_AND_MODELS = {
    #'Google Gemini': ["gemini-1.5-flash", "gemini-1.5-pro"],
    'Groq Llama': [ "llama3-70b-8192"],
    #'Groq Llama': ["llama3-8b-8192"],
    #'DeepSeek': ["deepseek-coder", "deepseek-chat"]
}

# Define the prompt strategies to test for each LLM
PROMPT_STRATEGIES = [
    "chain_of_thought",
    "role_playing",
    "constraint_based",
    "guided_tree_of_thought"
]

# Define HumanEval-specific prompt strategies
HUMANEVAL_PROMPT_STRATEGIES = [
    "humaneval_chain_of_thought",
    "humaneval_role_playing",
    "humaneval_constraint_based",
    "humaneval_guided_tree_of_thought"
]

# Define the traditional tools to run as a baseline
TRADITIONAL_TOOLS = [
    "Randoop"
]

def prepare_benchmark(benchmark_name: str):
    print(f"\n--- PREPARING BENCHMARK: {benchmark_name} ---")
    benchmark_path = os.path.join(Config.BENCHMARK_DIR, benchmark_name)

    if not os.path.exists(benchmark_path):
        print(f"Error: Benchmark path not found at {benchmark_path}")
        return False

    commands = [
        ["mvn", "clean"],
        ["mvn", "install", "-DskipTests"],
        ["mvn", "dependency:copy-dependencies"]
    ]

    for cmd in commands:
        print(f"Running command: '{' '.join(cmd)}' in {benchmark_path}...")
        try:
            subprocess.run(
                cmd,
                cwd=benchmark_path,
                check=True,
                capture_output=True,
                text=True
            )
        except subprocess.CalledProcessError as e:
            print(f"!!!!!! Maven command failed for '{' '.join(cmd)}' !!!!!!")
            print(e.stderr)
            return False
    
    print("Benchmark prepared successfully.")
    return True


def main(run_mode='humaneval'):
    db_path = Config.DATABASE_PATH
    if os.path.exists(db_path):
        print(f"Using existing database at: {db_path}")
    else:
        print(f"Creating new database at: {db_path}")

    print("--- INITIALIZING PILOT STUDY ---")

    init_db()
    
    if run_mode == 'springboot':
        print("\n--- RUNNING IN SPRINGBOOT MODE ---")
        benchmark_name = "spring-petclinic"
        scenario_file = f"scenarios_{benchmark_name}.json"
        if not prepare_benchmark(benchmark_name):
            print("Halting full study due to benchmark preparation failure.")
            return
    elif run_mode == 'humaneval':
        print("\n--- RUNNING IN HUMANEVAL MODE ---")
        benchmark_name = "humaneval"
        scenario_file = 'scenarios_humaneval.json'
    else:
        print(f"Error: Unknown run mode '{run_mode}'")
        return

    with open(scenario_file, 'r') as f:
        all_scenarios = json.load(f)
    
    SCENARIOS_TO_RUN = list(all_scenarios.keys())

    # Run Traditional Tool Experiments only for spring-petclinic
    if benchmark_name == "spring-petclinic":
        print("\n--- PHASE 1: RUNNING TRADITIONAL BASELINES ---")
        for scenario in SCENARIOS_TO_RUN:
            for tool in TRADITIONAL_TOOLS:
                print(f"\n=> Running {tool} on {scenario}...")
                try:
                    run_experiment(
                        generator_name=tool,
                        model_name=None,
                        prompt_strategy=None,
                        benchmark_name="spring-petclinic",
                        scenario_name=scenario
                    )
                except Exception as e:
                    print(f"!!!!!! An error occurred while running {tool} on {scenario}: {e} !!!!!!")

    print("\n--- PHASE 2: RUNNING LLM GENERATORS ---")  
    strategies_to_use = HUMANEVAL_PROMPT_STRATEGIES if benchmark_name == "humaneval" else PROMPT_STRATEGIES
    
    for scenario in SCENARIOS_TO_RUN:
        for provider, models in LLM_PROVIDERS_AND_MODELS.items():
            for model in models:
                for strategy in strategies_to_use:
                    print(f"\n=> Running {provider} ({model}) on {scenario} with strategy '{strategy}'...")
                    try:
                        run_experiment(
                            generator_name=provider,
                            model_name=model,
                            prompt_strategy=strategy,
                            benchmark_name=benchmark_name,
                            scenario_name=scenario
                        )
                    except Exception as e:
                        print(f"!!!!!! An error occurred for {provider}/{model}/{strategy} on {scenario}: {e} !!!!!!")

    print("\n--- EXPERIMENT EXECUTION COMPLETE ---")
    print("All experiments have been executed. Check the database and the 'outputs' directory for results.")

if __name__ == "__main__":
    main()

