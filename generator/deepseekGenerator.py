# generators/deepseek_generator.py
import os
from openai import OpenAI
from .baseGenerator import TestGenerator

class DeepSeekGenerator(TestGenerator):
 
    def __init__(self, config: dict):
        super().__init__(config)
        self.api_key = self.config.get("DEEPSEEK_API_KEY")
        if not self.api_key:
            print("Error: DEEPSEEK_API_KEY not found in configuration.")

    def generate(self, prompt: str, context: dict, model_name: str) -> str:
        if not self.api_key:
            return "Error: DeepSeek API key is not configured."
        try:
            client = OpenAI(
                api_key=self.api_key,
                base_url="https://api.deepseek.com/v1"
            )
            chat_completion = client.chat.completions.create(
                messages=[
                    {
                        "role": "system",
                        "content": "You are an expert Java test engineer. You write complete, compilable, and high-quality integration tests based on the provided source code. You only output the Java code, with no additional explanation."
                    },
                    {
                        "role": "user",
                        "content": prompt,
                    }
                ],
                model=model_name,
            )
            raw_response = chat_completion.choices[0].message.content
            time_cost = chat_completion.usage.total_time
            token_cost = chat_completion.usage.total_tokens
            if not raw_response:
                return "Error: No response text received from DeepSeek API."
            return self._extract_code(raw_response), time_cost, token_cost
        except Exception as e:
            return f"An error occurred while calling the DeepSeek API: {e}"

    def _extract_code(self, response_text: str) -> str:
        if "```java" in response_text:
            return response_text.split("```java")[1].split("```")[0].strip()
        return response_text
