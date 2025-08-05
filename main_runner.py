from run_experiment import run_experiment
from database import init_db
from config import Config
import os
import subprocess

SCENARIOS_TO_RUN = [
    "person_model",
    "vet_model",
    "owner_controller",
    "pet_validator"
]

# Define the LLM providers and models to test
LLM_PROVIDERS_AND_MODELS = {
    'Groq Llama': ["llama3-8b-8192"]
}

# Define the prompt strategies to test for each LLM
PROMPT_STRATEGIES = [
    "chain_of_thought",
    "role_playing",
    "constraint_based",
    "guided_tree_of_thought"
]

# Define the traditional tools to run as a baseline
TRADITIONAL_TOOLS = [
    "Randoop"
]

def prepare_benchmark(benchmark_name: str):
    """
    Ensures the benchmark project is clean and all dependencies are copied.
    This should be run once before starting the experiments.
    """
    print(f"\n--- PREPARING BENCHMARK: {benchmark_name} ---")
    benchmark_path = os.path.join(Config.BENCHMARK_DIR, benchmark_name)

    if not os.path.exists(benchmark_path):
        print(f"Error: Benchmark path not found at {benchmark_path}")
        return False

    # Commands to run
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
                capture_output=True, # Hide verbose output unless there's an error
                text=True
            )
        except subprocess.CalledProcessError as e:
            print(f"!!!!!! Maven command failed for '{' '.join(cmd)}' !!!!!!")
            print(e.stderr)
            return False
    
    print("Benchmark prepared successfully.")
    return True


def main():
    """
    The master script to run all experiments for the pilot study.
    """
    db_path = Config.DATABASE_PATH
    if os.path.exists(db_path):
        print(f"Removing existing database at: {db_path}")
        os.remove(db_path)

    print("--- INITIALIZING PILOT STUDY ---")

    init_db()
    if not prepare_benchmark("spring-petclinic"):
        print("Halting pilot study due to benchmark preparation failure.")
        return

    # --- Run Traditional Tool Experiments ---
    # print("\n--- PHASE 1: RUNNING TRADITIONAL BASELINES ---")
    # for scenario in SCENARIOS_TO_RUN:
    #     for tool in TRADITIONAL_TOOLS:
    #         print(f"\n=> Running {tool} on {scenario}...")
    #         try:
    #             run_experiment(
    #                 generator_name=tool,
    #                 model_name=None,
    #                 prompt_strategy=None,
    #                 benchmark_name="spring-petclinic",
    #                 scenario_name=scenario
    #             )
    #         except Exception as e:
    #             print(f"!!!!!! An error occurred while running {tool} on {scenario}: {e} !!!!!!")

    #--- Run LLM Experiments ---
    print("\n--- PHASE 2: RUNNING LLM GENERATORS ---")
    for scenario in SCENARIOS_TO_RUN:
        for provider, models in LLM_PROVIDERS_AND_MODELS.items():
            for model in models:
                for strategy in PROMPT_STRATEGIES:
                    print(f"\n=> Running {provider} ({model}) on {scenario} with strategy '{strategy}'...")
                    try:
                        run_experiment(
                            generator_name=provider,
                            model_name=model,
                            prompt_strategy=strategy,
                            benchmark_name="spring-petclinic",
                            scenario_name=scenario
                        )
                    except Exception as e:
                        print(f"!!!!!! An error occurred for {provider}/{model}/{strategy} on {scenario}: {e} !!!!!!")

    print("\n--- PILOT STUDY COMPLETE ---")
    print("All experiments have been executed. Check the database and the 'outputs' directory for results.")

if __name__ == "__main__":
    main()

