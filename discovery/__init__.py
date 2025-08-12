"""
Discovery package for automatically generating test scenarios from different benchmark types.
"""

from .discover_classes import discover_classes_in_project
from .discover_humaneval import discover_humaneval_scenarios

__all__ = [
    'discover_classes_in_project',
    'discover_humaneval_scenarios'
]
