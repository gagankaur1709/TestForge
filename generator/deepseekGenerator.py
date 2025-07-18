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

    def generate(self, code_context: str, prompt_strategy: str, model_name: str) -> str:
        if not self.api_key:
            return "Error: DeepSeek API key is not configured."

        try:
            client = OpenAI(
                api_key=self.api_key,
                base_url="https://api.deepseek.com/v1"
            )
            
            prompt_template = self._load_prompt_template(prompt_strategy)
            full_prompt = prompt_template.format(code_context=code_context)
            
            chat_completion = client.chat.completions.create(
                messages=[
                    {
                        "role": "system",
                        "content": "You are an expert Java test engineer. You write complete, compilable, and high-quality integration tests based on the provided source code. You only output the Java code, with no additional explanation."
                    },
                    {
                        "role": "user",
                        "content": full_prompt,
                    }
                ],
                model=model_name,
            )
            
            raw_response = chat_completion.choices[0].message.content
            
            if not raw_response:
                return "Error: No response text received from DeepSeek API."
            return self._extract_code(raw_response)

        except FileNotFoundError:
            return f"Error: Prompt template file not found for strategy '{prompt_strategy}'."
        except Exception as e:
            return f"An error occurred while calling the DeepSeek API: {e}"

    def _load_prompt_template(self, strategy: str) -> str:
        prompt_file = os.path.join('prompts', f'{strategy}.txt')
        with open(prompt_file, 'r') as f:
            return f.read()

    def _extract_code(self, response_text: str) -> str:
        if "```java" in response_text:
            return response_text.split("```java")[1].split("```")[0].strip()
        return response_text
