# test_generator_script.py

import sys
import os
sys.path.insert(0, os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from generator.geminiGenerator import GeminiGenerator
from config import Config

def main():
    print("--- Starting Test for GeminiGenerator ---")
    app_config = {
        "GOOGLE_API_KEY": Config.GOOGLE_API_KEY
    }

    try:
        gemini_gen = GeminiGenerator(config=app_config)
        print("GeminiGenerator instantiated successfully.")
    except Exception as e:
        print(f"Failed to instantiate GeminiGenerator: {e}")
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
    
    prompt_strategy = "chain_of_thought" # This must match the filename in /prompts

    print(f"\nGenerating test with strategy: '{prompt_strategy}'...")
    generated_code = gemini_gen.generate(
        code_context=sample_code_context,
        prompt_strategy=prompt_strategy
    )
    print("\n--- Generated Code ---")
    if "Error:" in generated_code:
        print(f"An error occurred: {generated_code}")
    else:
        print(generated_code)
    print("\n--- End of Test ---")


if __name__ == "__main__":
    main()
