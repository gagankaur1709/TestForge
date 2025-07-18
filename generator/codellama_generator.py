# generators/codellama_generator.py

import os
from groq import Groq
from .baseGenerator import TestGenerator

class CodeLlamaGenerator(TestGenerator):
    """
    A concrete implementation of TestGenerator for the CodeLlama-70b model,
    accessed via the Groq API.
    """

    def __init__(self, config: dict):
        super().__init__(config)
        self.api_key = self.config.get("GROQ_API_KEY")
        if not self.api_key:
            print("Error: GROQ_API_KEY not found in configuration.")

    def generate(self, code_context: str, prompt_strategy: str) -> str:
        if not self.api_key:
            return "Error: Groq API key is not configured."

        try:
            client = Groq(api_key=self.api_key)
            prompt_template = self._load_prompt_template(prompt_strategy)
            full_prompt = prompt_template.format(code_context=code_context)
            
            chat_completion = client.chat.completions.create(
                messages=[
                    {
                        "role": "system",
                        "content": "You are a senior software test engineer specializing in Java integration tests. You only output Java code, with no explanations."
                    },
                    {
                        "role": "user",
                        "content": full_prompt,
                    }
                ],
                model="llama3-70b-8192",
            )
            
            raw_response = chat_completion.choices[0].message.content
            
            if not raw_response:
                return "Error: No response text received from Groq API."
            return self._extract_code(raw_response)

        except FileNotFoundError:
            return f"Error: Prompt template file not found for strategy '{prompt_strategy}'."
        except Exception as e:
            return f"An error occurred while calling the Groq API: {e}"

    def _load_prompt_template(self, strategy: str) -> str:
        prompt_file = os.path.join('prompts', f'{strategy}.txt')
        with open(prompt_file, 'r') as f:
            return f.read()

    def _extract_code(self, response_text: str) -> str:
        if "```java" in response_text:
            return response_text.split("```java")[1].split("```")[0].strip()
        return response_text
