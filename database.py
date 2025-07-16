# database.py

import sqlite3
import os
from config import Config

def get_db_connection():
    conn = sqlite3.connect(Config.DATABASE_PATH)
    conn.row_factory = sqlite3.Row
    return conn

def init_db():
    print("Initializing database...")
    conn = get_db_connection()
    cursor = conn.cursor()

    # Schema for the experiments table
    cursor.execute('''
        CREATE TABLE IF NOT EXISTS experiments (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            experiment_id TEXT NOT NULL UNIQUE,
            timestamp DATETIME DEFAULT CURRENT_TIMESTAMP,
            generator_name TEXT NOT NULL,
            prompt_strategy TEXT NOT NULL,
            benchmark_name TEXT NOT NULL,
            
            -- Effectiveness Metrics
            compiles BOOLEAN,
            runs_successfully BOOLEAN,
            fault_detected BOOLEAN,
            line_coverage REAL,
            branch_coverage REAL,
            
            -- Maintainability Metrics
            cyclomatic_complexity INTEGER,
            cognitive_complexity INTEGER,
            coupling_between_objects INTEGER,
            test_brittleness_score INTEGER,
            
            -- Cost Metrics
            time_cost REAL,
            token_cost INTEGER,
            
            -- Path to saved artifacts
            output_path TEXT
        )
    ''')
    
    conn.commit()
    conn.close()
    print("Database initialized successfully.")

def add_experiment_result(result_data: dict):
    conn = get_db_connection()
    cursor = conn.cursor()
    
    # Using parameterized queries to prevent SQL injection
    query = '''
        INSERT INTO experiments (
            experiment_id, generator_name, prompt_strategy, benchmark_name,
            compiles, runs_successfully, fault_detected, line_coverage, branch_coverage,
            cyclomatic_complexity, cognitive_complexity, coupling_between_objects, test_brittleness_score,
            time_cost, token_cost, output_path
        ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
    '''
    
    values = (
        result_data.get('experiment_id'),
        result_data.get('generator_name'),
        result_data.get('prompt_strategy'),
        result_data.get('benchmark_name'),
        result_data.get('compiles'),
        result_data.get('runs_successfully'),
        result_data.get('fault_detected'),
        result_data.get('line_coverage'),
        result_data.get('branch_coverage'),
        result_data.get('cyclomatic_complexity'),
        result_data.get('cognitive_complexity'),
        result_data.get('coupling_between_objects'),
        result_data.get('test_brittleness_score'),
        result_data.get('time_cost'),
        result_data.get('token_cost'),
        result_data.get('output_path')
    )
    
    cursor.execute(query, values)
    conn.commit()
    conn.close()
    print(f"Result for experiment '{result_data.get('experiment_id')}' added to database.")

def get_all_experiments():
    conn = get_db_connection()
    experiments = conn.execute('SELECT * FROM experiments ORDER BY timestamp DESC').fetchall()
    conn.close()
    return experiments

