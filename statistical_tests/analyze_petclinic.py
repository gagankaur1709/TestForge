# analyze_results.py

import pandas as pd
import sqlite3
import scipy.stats as stats
import scikit_posthocs as sp
import matplotlib.pyplot as plt
import seaborn as sns
import os
import sys

sys.path.append(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from config import Config

DB_PATH = Config.DATABASE_PATH
OUTPUT_DIR = "analysis_results"
BENCHMARK_TO_ANALYZE = "spring-petclinic"

os.makedirs(OUTPUT_DIR, exist_ok=True)

def load_data_from_db(benchmark_name: str) -> pd.DataFrame:
    """Loads and prepares the data from the SQLite database."""
    print(f"Loading data from database: {DB_PATH}")
    try:
        conn = sqlite3.connect(DB_PATH)
        df = pd.read_sql_query("SELECT * FROM experiments", conn)
        conn.close()
        
        print(f"Successfully loaded {len(df)} total records.")
        df_filtered = df[df['benchmark_name'] == benchmark_name].copy()
        
        df_filtered['method'] = df_filtered['generator_name'] + " (" + df_filtered['prompt_strategy'] + ")"
        df_filtered['method'] = df_filtered['method'].str.replace(r' \(N/A\)', '', regex=True)

        print(f"Found {len(df_filtered)} records for benchmark: '{benchmark_name}'")
        return df_filtered
        
    except Exception as e:
        print(f"Error loading data from database: {e}")
        return pd.DataFrame()

def perform_statistical_analysis(df: pd.DataFrame, metric: str, traditional_tools: list, llm_methods: list):
    print(f"\n--- Performing Statistical Analysis for Metric: '{metric}' ---")

    all_methods = traditional_tools + llm_methods
    data_groups = [df[df['method'] == m][metric].dropna() for m in all_methods]
    
    print("\nComparing all methods simultaneously (Kruskal-Wallis H-Test):")
    h_statistic, p_value = stats.kruskal(*data_groups)
    print(f"  H-statistic: {h_statistic:.4f}, P-value: {p_value:.4f}")
    if p_value < 0.05:
        print("  => Result is STATISTICALLY SIGNIFICANT. There are differences among the methods.")
    else:
        print("  => Result is NOT statistically significant.")

    best_llm_method = df[df['method'].isin(llm_methods)].groupby('method')[metric].median().idxmax()
    print(f"\nIdentifying best LLM method based on median '{metric}': {best_llm_method}")

    llm_data = df[df['method'] == best_llm_method][metric].dropna()

    for tool in traditional_tools:
        print(f"\nComparing '{best_llm_method}' vs. '{tool}' (Mann-Whitney U Test):")
        tool_data = df[df['method'] == tool][metric].dropna()
        if len(tool_data) > 0 and len(llm_data) > 0:
            u_statistic, p_value = stats.mannwhitneyu(llm_data, tool_data, alternative='two-sided')
            print(f"  U-statistic: {u_statistic:.4f}, P-value: {p_value:.4f}")
            if p_value < 0.05:
                print("  => Result is STATISTICALLY SIGNIFICANT. The two methods are different.")
            else:
                print("  => Result is NOT statistically significant.")
        else:
            print("  Not enough data to compare.")


def generate_visualizations(df: pd.DataFrame, metric: str):
    print(f"\n--- Generating Visualization for Metric: '{metric}' ---")
    
    plt.figure(figsize=(14, 8))
    sns.boxplot(data=df, x='method', y=metric)
    
    plt.title(f"Comparison of All Methods for '{metric}' on {BENCHMARK_TO_ANALYZE}", fontsize=16)
    plt.xlabel("Generation Method", fontsize=12)
    plt.ylabel(metric.replace('_', ' ').title(), fontsize=12)
    plt.xticks(rotation=45, ha='right')
    plt.tight_layout()
    
    output_path = os.path.join(OUTPUT_DIR, f"petclinic_{metric}_comparison.png")
    plt.savefig(output_path)
    print(f"Box plot saved to: {output_path}")
    plt.close()

def main():
    df_petclinic = load_data_from_db(BENCHMARK_TO_ANALYZE)

    if df_petclinic.empty:
        print("No data found for the specified benchmark. Exiting analysis.")
        return

    all_methods = sorted(df_petclinic['method'].unique())
    traditional_tools = [m for m in all_methods if 'Randoop' in m or 'EvoSuite' in m]
    llm_methods = [m for m in all_methods if not m in traditional_tools]

    metrics_to_analyze = [
        'line_coverage',
        'branch_coverage',
        'cyclomatic_complexity',
        'coupling_between_objects'
    ]

    for metric in metrics_to_analyze:
        if metric in df_petclinic.columns:
            perform_statistical_analysis(df_petclinic, metric, traditional_tools, llm_methods)
            generate_visualizations(df_petclinic, metric)
        else:
            print(f"\nWarning: Metric '{metric}' not found in the database. Skipping analysis.")

    print("\n--- Analysis for RQ2 Complete ---")

if __name__ == "__main__":
    main()
