import os
from groq import Groq
from typing import Optional
from .baseGenerator import TestGenerator

class CodeLlamaGenerator(TestGenerator):

    def __init__(self, config: dict):
        super().__init__(config)
        self.api_key = self.config.get("GROQ_API_KEY")
        if not self.api_key:
            raise ValueError("GROQ_API_KEY not found in configuration")
        self.client = Groq(api_key=self.api_key)

    def generate(self, prompt: str, prompt_strategy: Optional[str] = None, model_name: Optional[str] = None) -> str:
        if not model_name:
            return "Error: model_name must be provided for CodeLlamaGenerator."
            
        try:
            system_message = (
                "You are a senior Java test engineer specializing in JUnit 5 and Mockito. "
                "Your task is to write a high-quality unit test for the provided class. "
                "The test must be complete, compilable, and test the class in isolation by mocking all dependencies. "
                "You only output the Java code, with no additional explanation."
            )
            
            chat_completion = self.client.chat.completions.create(
                messages=[
                    {
                        "role": "system",
                        "content": system_message
                    },
                    {
                        "role": "user",
                        "content": prompt,
                    }
                ],
                model=model_name,
                temperature=0.2, 
                max_tokens=2048  
            )
            
            raw_response = chat_completion.choices[0].message.content
            time_cost = chat_completion.usage.total_time
            token_cost = chat_completion.usage.total_tokens
            
            if not raw_response:
                return "Error: No response text received from Groq API."
                
            return self.extract_code(raw_response), time_cost, token_cost

        except Exception as e:
            return f"An error occurred while calling the Groq API: {e}"

    def extract_code(self, response_text: str) -> str:
        if "```java" in response_text:
            return response_text.split("```java")[1].split("```")[0].strip()
        return response_text
