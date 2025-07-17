# generators/base_generator.py

from abc import ABC, abstractmethod

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
    def generate(self, code_context: str, prompt_strategy: str) -> str:
        """
        The main method to generate a test suite.

        Args:
            code_context: A string containing the source code to be tested.
            prompt_strategy: A string identifying the prompting technique

        Returns:
            A string containing the complete, generated test code.
        """
        pass