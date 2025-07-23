# generators/codellama_generator.py

import os
from typing import Dict, Optional
from groq import Groq
from .baseGenerator import TestGenerator

class CodeLlamaGenerator(TestGenerator):
    """
    A concrete implementation of TestGenerator for the CodeLlama-70b model,
    accessed via the Groq API.
    """

    def __init__(self, config: Dict):
        super().__init__(config)
        self.api_key = self.config.get("GROQ_API_KEY")
        if not self.api_key:
            raise ValueError("GROQ_API_KEY not found in configuration")
        self.client = Groq(api_key=self.api_key)

    def generate(self, prompt: str, context: Dict, model_name: str) -> str:
        """
        Generates integration tests using CodeLlama via Groq API.
        Args:
            prompt: Pre-formatted prompt string from the prompt template
            context: Dictionary containing:
                - scenario: Scenario details from scenarios.json
                - files: Code context dictionary {filename: content}
            model_name: Name of the model to use (e.g., "llama3-8b-8192")
        Returns:
            Generated Java test code as string, or error message if failed
        """
        try:
            system_message = self._create_system_message(context.get('scenario', {}))
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
                temperature=0.3,
                max_tokens=2000
            )
            raw_response = chat_completion.choices[0].message.content
            if raw_response is None:
                return "Error: No response received from model."
            return self._postprocess_response(raw_response)
        except Exception as e:
            return f"Error: {str(e)}"

    def _create_system_message(self, scenario: Dict) -> str:
        return (
            "You are a senior Java test engineer specializing in Spring integration tests. "
            f"Current task: {scenario.get('description', '')}\n"
            "Output requirements:\n"
            "1. Only generate valid Java test code\n"
            "2. Use JUnit 5 and Spring test conventions\n"
            "3. Include necessary imports\n"
            "4. Focus on testing integration points\n"
            "5. Format code with proper indentation"
        )

    def _postprocess_response(self, response_text: str) -> str:
        """
        Extracts Java code from response and ensures proper formatting.
        Handles:
        - Code fence extraction (```java)
        - Basic syntax validation
        - Import statement preservation
        """
        if "```java" in response_text:
            code = response_text.split("```java")[1].split("```")[0].strip()
        else:
            code = response_text
        if "class " not in code:
            code = f"public class {self._generate_class_name()} {{\n{code}\n}}"
        return code

    def _generate_class_name(self) -> str:
        """Generates a fallback test class name if none detected"""
        return "IntegrationTest" + str(hash(os.urandom(8)))[:4]