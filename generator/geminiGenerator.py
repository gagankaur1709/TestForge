import time
from google import genai
from google.genai import types
from .baseGenerator import TestGenerator

class GeminiGenerator(TestGenerator):
    def __init__(self, config: dict):
        super().__init__(config)
        self.api_key = self.config.get("GOOGLE_API_KEY")
        if not self.api_key:
            print("Error: GOOGLE_API_KEY not found in configuration.")

    def generate(self, prompt: str, context: dict, model_name: str) -> str:
        if not self.api_key:
            return "Error: Gemini API key is not configured."
        try:
            client = genai.Client(api_key=self.api_key)
            print(f"Generating code with model: {model_name}")
            start_time = time.time()
            response = client.models.generate_content(
                model=f'models/{model_name}',
                contents=prompt
            )
            time_cost = time.time() - start_time
            raw_response = response.text
            token_cost = response.usage_metadata.total_token_count
            if raw_response is None:
                return "Error: No response received from Gemini API."
            return self._extract_code(raw_response), time_cost, token_cost
        except Exception as e:
            return f"An error occurred while calling the Gemini API: {e}"

    def _extract_code(self, response_text: str) -> str:
        if "```java" in response_text:
            return response_text.split("```java")[1].split("```")[0].strip()
        return response_text
