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
            line_coverage REAL,
            branch_coverage REAL,
            
            -- Maintainability Metrics
            cyclomatic_complexity INTEGER,
            coupling_between_objects INTEGER,
            
            -- Cost Metrics
            time_cost REAL,
            token_cost INTEGER
        )
    ''')
    
    # Schema for the statistical test results table
    cursor.execute('''
        CREATE TABLE IF NOT EXISTS statistical_results (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            timestamp DATETIME DEFAULT CURRENT_TIMESTAMP,
            benchmark_name TEXT NOT NULL,
            metric_name TEXT NOT NULL,
            test_type TEXT NOT NULL,
            test_statistic REAL,
            p_value REAL,
            is_significant BOOLEAN,
            significance_level REAL,
            sample_size INTEGER,
            group_names TEXT,
            posthoc_results TEXT,
            analysis_stage TEXT
        )
    ''')
    
    conn.commit()
    conn.close()
    print("Database initialized successfully.")

def add_experiment_result(result_data: dict):
    conn = get_db_connection()
    cursor = conn.cursor()
    
    query = '''
        INSERT INTO experiments (
            experiment_id, generator_name, prompt_strategy, benchmark_name,
            compiles, runs_successfully, line_coverage, branch_coverage,
            cyclomatic_complexity, coupling_between_objects,
            time_cost, token_cost
        ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
    '''
    
    values = (
        result_data.get('experiment_id'),
        result_data.get('generator_name'),
        result_data.get('prompt_strategy'),
        result_data.get('benchmark_name'),
        result_data.get('compiles'),
        result_data.get('runs_successfully'),
        result_data.get('line_coverage'),
        result_data.get('branch_coverage'),
        result_data.get('cyclomatic_complexity'),
        result_data.get('coupling_between_objects'),
        result_data.get('time_cost'),
        result_data.get('token_cost')
    )
    
    cursor.execute(query, values)
    conn.commit()
    conn.close()
    print(f"Result for experiment '{result_data.get('experiment_id')}' added to database.")

def get_all_experiments():
    conn = get_db_connection()
    print("Getting all experiments...")
    experiments = conn.execute('SELECT * FROM experiments ORDER BY timestamp DESC').fetchall()
    conn.close()
    return experiments

def add_statistical_result(result_data: dict):
    conn = get_db_connection()
    cursor = conn.cursor()
    
    query = '''
        INSERT INTO statistical_results (
            benchmark_name, metric_name, test_type, test_statistic, p_value,
            is_significant, significance_level, sample_size, group_names,
            posthoc_results, analysis_stage
        ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
    '''
    
    values = (
        result_data.get('benchmark_name'),
        result_data.get('metric_name'),
        result_data.get('test_type'),
        result_data.get('test_statistic'),
        result_data.get('p_value'),
        result_data.get('is_significant'),
        result_data.get('significance_level'),
        result_data.get('sample_size'),
        result_data.get('group_names'),
        result_data.get('posthoc_results'),
        result_data.get('analysis_stage')
    )
    
    cursor.execute(query, values)
    conn.commit()
    conn.close()
    print(f"Statistical result for {result_data.get('metric_name')} saved to database.")

def get_statistical_results(benchmark_name: str = None):
    conn = get_db_connection()
    if benchmark_name:
        results = conn.execute('SELECT * FROM statistical_results WHERE benchmark_name = ? ORDER BY timestamp DESC', (benchmark_name,)).fetchall()
    else:
        results = conn.execute('SELECT * FROM statistical_results ORDER BY timestamp DESC').fetchall()
    conn.close()
    return results
