# generators/base_generator.py

from abc import ABC, abstractmethod
from typing import Optional

class TestGenerator(ABC):
    """
    This class defines the standard contract that every generator must follow.
    """
    
    def __init__(self, config: dict):
        """
        Initializes the generator with a configuration dictionary.
        
        Args:
            config: A dictionary containing all necessary settings
        """
        self.config = config

    @abstractmethod
    def generate(self, code_context: str, prompt_strategy: Optional[str] = None, model_name: Optional[str] = None) -> str:
        """
        The main method to generate a test suite.

        Args:
            code_context: A string containing the source code or class name to be tested.
            prompt_strategy (Optional): The prompting technique to use. Ignored by non-LLM generators.
            model_name (Optional): The specific model to use. Ignored by non-LLM generators.

        Returns:
            A string containing the complete, generated test code.
        """
        pass