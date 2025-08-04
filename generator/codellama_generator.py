import os
from groq import Groq
from typing import Optional
from .baseGenerator import TestGenerator

class CodeLlamaGenerator(TestGenerator):
    """
    A concrete implementation of TestGenerator for Llama 3 models,
    accessed via the Groq API, tailored for unit testing.
    """

    def __init__(self, config: dict):
        super().__init__(config)
        self.api_key = self.config.get("GROQ_API_KEY")
        if not self.api_key:
            raise ValueError("GROQ_API_KEY not found in configuration")
        # Initialize the client once to be reused.
        self.client = Groq(api_key=self.api_key)

    def generate(self, prompt: str, prompt_strategy: Optional[str] = None, model_name: Optional[str] = None) -> str:
        """
        Generates a unit test by calling the Groq API.

        Args:
            prompt: The full, pre-formatted prompt string.
            prompt_strategy: The name of the prompt strategy (used for logging/tracking).
            model_name: The specific model to use (e.g., "llama3-70b-8192").

        Returns:
            A string containing the generated Java test code, or an error message.
        """
        if not model_name:
            return "Error: model_name must be provided for CodeLlamaGenerator."
            
        try:
            # The system message is now focused on unit testing principles.
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
                temperature=0.2, # Lower temperature for more deterministic code
                max_tokens=2048  # Generous token limit for test files
            )
            
            raw_response = chat_completion.choices[0].message.content
            
            if not raw_response:
                return "Error: No response text received from Groq API."
                
            return self._extract_code(raw_response)

        except Exception as e:
            return f"An error occurred while calling the Groq API: {e}"

    def _extract_code(self, response_text: str) -> str:
        """
        A simple utility to extract a Java code block from the LLM's response.
        """
        if "```java" in response_text:
            return response_text.split("```java")[1].split("```")[0].strip()
        # Fallback if the model doesn't use markdown formatting
        return response_text
