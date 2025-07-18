# tests/test_groq_api.py

import sys
import os

# This makes sure the script can find your other project files
sys.path.insert(0, os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from generator.codellama_generator import CodeLlamaGenerator
from config import Config

def main():
    print("--- Starting Test for CodeLlamaGenerator (via Groq) ---")

    app_config = {
        "GROQ_API_KEY": Config.GROQ_API_KEY
    }

    try:
        codellama_gen = CodeLlamaGenerator(config=app_config)
        print("CodeLlamaGenerator instantiated successfully.")
    except Exception as e:
        print(f"Failed to instantiate CodeLlamaGenerator: {e}")
        return


    sample_code_context = """
    // Owner.java
    public class Owner {
        private String name;
        public void setName(String name) { this.name = name; }
        public String getName() { return this.name; }
    }

    // Pet.java
    public class Pet {
        private Owner owner;
        public void setOwner(Owner owner) { this.owner = owner; }
        public Owner getOwner() { return this.owner; }
    }
    """
    
    prompt_strategy = "chain_of_thought"
    model_name = "llama3-8b-8192"

    print(f"\nGenerating test with model '{model_name}' and strategy '{prompt_strategy}'...")

    generated_code = codellama_gen.generate(
        code_context=sample_code_context,
        prompt_strategy=prompt_strategy,
        model_name=model_name
    )

    print("\n--- Generated Code ---")
    if "Error:" in generated_code:
        print(f"An error occurred: {generated_code}")
    else:
        print(generated_code)
    print("\n--- End of Test ---")


if __name__ == "__main__":
    main()
