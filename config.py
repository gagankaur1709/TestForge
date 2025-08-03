# Application configuration (API keys, DB paths)
import os

class Config:
    GOOGLE_API_KEY = os.getenv("GOOGLE_API_KEY")
    DATABASE_PATH = os.path.join('data', 'experiments.db')
    BENCHMARK_DIR = 'benchmark'
    SECRET_KEY = os.getenv("SECRET_KEY")
    GROQ_API_KEY = os.getenv("GROQ_API_KEY")
    DEEPSEEK_API_KEY = os.getenv("DEEPSEEK_API_KEY")
    EVOSUITE_JAR_PATH = os.path.join('tools', 'evosuite-1.2.0.jar')
    RANDOOP_JAR_PATH = os.path.join('tools', 'randoop-all-4.3.4.jar') 