import os
from google import genai
from google.genai import types
from baseGenerator import TestGenerator

class GeminiGenerator(TestGenerator):
    """
    A concrete implementation of TestGenerator for the Google Gemini Pro model,
    using the explicit Client pattern.
    """

    def __init__(self, config: dict):
        super().__init__(config)
        self.api_key = self.config.get("GOOGLE_API_KEY")
        if not self.api_key:
            print("Error: GOOGLE_API_KEY not found in configuration.")

    def generate(self, code_context: str, prompt_strategy: str) -> str:
        if not self.api_key:
            return "Error: Gemini API key is not configured."

        try:
            client = genai.Client(api_key=self.api_key,
                                  http_options=types.HttpOptions(api_version='v1alpha'))
            prompt_template = self._load_prompt_template(prompt_strategy)  # Load the specific prompt strategy
            full_prompt = prompt_template.format(code_context=code_context) # Construct the full prompt
            
            response = client.models.generate_content(
                model='gemini-1.5-pro-latest', # Specifying the model string
                contents=full_prompt
            )
            
            raw_response = response.text
            if raw_response is None:
                return "Error: No response received from Gemini API."
            return self._extract_code(raw_response)

        except FileNotFoundError:
            return f"Error: Prompt template file not found for strategy '{prompt_strategy}'."
        except Exception as e:
            return f"An error occurred while calling the Gemini API: {e}"

    def _load_prompt_template(self, strategy: str) -> str:
        prompt_file = os.path.join('prompts', f'{strategy}.txt')
        with open(prompt_file, 'r') as f:
            return f.read()

    def _extract_code(self, response_text: str) -> str:
        if "```java" in response_text:
            return response_text.split("```java")[1].split("```")[0].strip()
        return response_text
