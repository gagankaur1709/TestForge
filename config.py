# Application configuration (API keys, DB paths)
import os

class Config:
    GOOGLE_API_KEY = os.getenv("GOOGLE_API_KEY")
    DATABASE_PATH = os.path.join('data', 'experiments.db')