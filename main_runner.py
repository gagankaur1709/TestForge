from run_experiment import run_experiment
from database import init_db
import json

SCENARIOS_TO_RUN = [
    "person_model",
    "vet_model",
    "owner_controller"
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

def main():
    """
    The master script to run all experiments for the pilot study.
    """
    print("--- INITIALIZING PILOT STUDY ---")
    init_db()

    # --- Run Traditional Tool Experiments ---
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

    # --- Run LLM Experiments ---
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

