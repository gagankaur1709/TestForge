# test_generator_script.py

from generator.geminiGenerator import GeminiGenerator
from config import Config

def main():
    """
    A simple script to test the GeminiGenerator and verify that it can
    successfully call the API and generate a test.
    """
    print("--- Starting Test for GeminiGenerator ---")

    # 1. Load the application configuration
    app_config = {
        "GOOGLE_API_KEY": Config.GOOGLE_API_KEY
    }

    # 2. Instantiate the generator
    try:
        gemini_gen = GeminiGenerator(config=app_config)
        print("GeminiGenerator instantiated successfully.")
    except Exception as e:
        print(f"Failed to instantiate GeminiGenerator: {e}")
        return

    # 3. Define a simple code context for testing
    # In a real run, you would read this from a benchmark file.
    # For now, we'll use a simple example.
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
    
    # 4. Specify the prompt strategy you want to test
    prompt_strategy = "chain_of_thought" # This must match the filename in /prompts

    print(f"\nGenerating test with strategy: '{prompt_strategy}'...")

    # 5. Call the generate method
    generated_code = gemini_gen.generate(
        code_context=sample_code_context,
        prompt_strategy=prompt_strategy
    )

    # 6. Print the result
    print("\n--- Generated Code ---")
    if "Error:" in generated_code:
        print(f"An error occurred: {generated_code}")
    else:
        print(generated_code)
    print("\n--- End of Test ---")


if __name__ == "__main__":
    main()
