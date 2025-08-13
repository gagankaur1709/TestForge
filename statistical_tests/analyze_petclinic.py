import pandas as pd
import sqlite3
import scipy.stats as stats
import scikit_posthocs as sp
import matplotlib.pyplot as plt
import seaborn as sns
import os
import sys
import json
from datetime import datetime

sys.path.append(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from config import Config
from database import add_statistical_result

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
    successful_df = df[df['runs_successfully'] == True].copy()
    print(f"Analyzing {len(successful_df)} successful runs for metric '{metric}'")

    all_methods = traditional_tools + llm_methods
    data_groups = [successful_df[successful_df['method'] == m][metric].dropna() for m in all_methods]
    
    print("\nComparing all methods simultaneously (Kruskal-Wallis H-Test):")
    h_statistic, p_value = stats.kruskal(*data_groups)
    print(f"  H-statistic: {h_statistic:.4f}, P-value: {p_value:.4f}")
    if p_value < 0.05:
        print("  => Result is STATISTICALLY SIGNIFICANT. There are differences among the methods.")
        is_significant = True
    else:
        print("  => Result is NOT statistically significant.")
        is_significant = False

    best_llm_method = successful_df[successful_df['method'].isin(llm_methods)].groupby('method')[metric].median().idxmax()
    print(f"\nIdentifying best LLM method based on median '{metric}': {best_llm_method}")

    llm_data = successful_df[successful_df['method'] == best_llm_method][metric].dropna()

    add_statistical_result({
        'benchmark_name': BENCHMARK_TO_ANALYZE,
        'metric_name': metric,
        'test_type': 'kruskal_wallis',
        'test_statistic': h_statistic,
        'p_value': p_value,
        'is_significant': is_significant,
        'significance_level': 0.05,
        'sample_size': len(successful_df),
        'group_names': json.dumps(all_methods),
        'posthoc_results': None,
        'analysis_stage': 'overall_comparison'
    })

    for tool in traditional_tools:
        print(f"\nComparing '{best_llm_method}' vs. '{tool}' (Mann-Whitney U Test):")
        tool_data = successful_df[successful_df['method'] == tool][metric].dropna()
        if len(tool_data) > 0 and len(llm_data) > 0:
            u_statistic, p_value = stats.mannwhitneyu(llm_data, tool_data, alternative='two-sided')
            print(f"  U-statistic: {u_statistic:.4f}, P-value: {p_value:.4f}")
            if p_value < 0.05:
                print("  => Result is STATISTICALLY SIGNIFICANT. The two methods are different.")
                is_significant = True
            else:
                print("  => Result is NOT statistically significant.")
                is_significant = False
        
            add_statistical_result({
                'benchmark_name': BENCHMARK_TO_ANALYZE,
                'metric_name': metric,
                'test_type': 'mann_whitney_u',
                'test_statistic': u_statistic,
                'p_value': p_value,
                'is_significant': is_significant,
                'significance_level': 0.05,
                'sample_size': len(llm_data) + len(tool_data),
                'group_names': json.dumps([best_llm_method, tool]),
                'posthoc_results': None,
                'analysis_stage': 'pairwise_comparison'
            })
        else:
            print("  Not enough data to compare.")

def analyze_correction_distance(df: pd.DataFrame, llm_methods: list):
    print(f"\n--- Analyzing Correction Distance for LLM Methods ---")
    failed_df = df[df['runs_successfully'] == False].copy()
    print(f"Analyzing {len(failed_df)} failed runs for correction distance")
    
    llm_df = failed_df[failed_df['method'].isin(llm_methods)].copy()
    llm_df = llm_df[llm_df['correction_distance'].notna()]
    
    if llm_df.empty:
        print("No correction distance data found for LLM methods.")
        return
    
    print(f"Found {len(llm_df)} LLM experiments with correction distance data.")
    
    methods_with_data = llm_df['method'].unique()
    print(f"Methods with correction distance data: {list(methods_with_data)}")
    
    data_groups = [llm_df[llm_df['method'] == m]['correction_distance'].dropna() for m in methods_with_data]
    
    if len(data_groups) < 2:
        print("Need at least 2 methods with data for statistical comparison.")
        return
    
    print("\nComparing LLM methods for correction distance (Kruskal-Wallis H-Test):")
    h_statistic, p_value = stats.kruskal(*data_groups)
    print(f"  H-statistic: {h_statistic:.4f}, P-value: {p_value:.4f}")
    if p_value < 0.05:
        print("  => Result is STATISTICALLY SIGNIFICANT. There are differences in correction distance among LLM methods.")
        is_significant = True
    else:
        print("  => Result is NOT statistically significant.")
        is_significant = False
    add_statistical_result({
        'benchmark_name': BENCHMARK_TO_ANALYZE,
        'metric_name': 'correction_distance',
        'test_type': 'kruskal_wallis',
        'test_statistic': h_statistic,
        'p_value': p_value,
        'is_significant': is_significant,
        'significance_level': 0.05,
        'sample_size': len(llm_df),
        'group_names': json.dumps(list(methods_with_data)),
        'posthoc_results': None,
        'analysis_stage': 'correction_distance_analysis'
    })
    
    print("\nCorrection Distance Summary by Method:")
    summary = llm_df.groupby('method')['correction_distance'].agg(['count', 'mean', 'median', 'std', 'min', 'max'])
    print(summary.round(4))
    
    best_method = llm_df.groupby('method')['correction_distance'].median().idxmin()
    print(f"\nBest LLM method (lowest correction distance): {best_method}")
    print(f"- Best method: {best_method} (median: {llm_df[llm_df['method'] == best_method]['correction_distance'].median():.4f})")

def generate_visualizations(df: pd.DataFrame, metric: str):
    print(f"\n--- Generating Visualization for Metric: '{metric}' ---")
    successful_df = df[df['runs_successfully'] == True].copy()
    
    plt.figure(figsize=(14, 8))
    sns.boxplot(data=successful_df, x='method', y=metric)
    
    plt.title(f"Comparison of All Methods for '{metric}' on {BENCHMARK_TO_ANALYZE} (Successful Runs Only)", fontsize=16)
    plt.xlabel("Generation Method", fontsize=12)
    plt.ylabel(metric.replace('_', ' ').title(), fontsize=12)
    plt.xticks(rotation=45, ha='right')
    plt.tight_layout()
    
    output_path = os.path.join(OUTPUT_DIR, f"petclinic_{metric}_comparison.png")
    plt.savefig(output_path)
    print(f"Box plot saved to: {output_path}")
    plt.close()

def generate_correction_distance_visualization(df: pd.DataFrame, llm_methods: list):
    print(f"\n--- Generating Correction Distance Visualization ---")
    failed_df = df[df['runs_successfully'] == False].copy()
    
    llm_df = failed_df[failed_df['method'].isin(llm_methods)].copy()
    llm_df = llm_df[llm_df['correction_distance'].notna()]
    
    if llm_df.empty:
        print("No correction distance data found for visualization.")
        return
    
    plt.figure(figsize=(12, 8))
    sns.boxplot(data=llm_df, x='method', y='correction_distance')
    
    plt.title(f"Correction Distance Comparison for LLM Methods on {BENCHMARK_TO_ANALYZE} (Failed Runs Only)", fontsize=16)
    plt.xlabel("LLM Method", fontsize=12)
    plt.ylabel("Correction Distance (Lower = Better)", fontsize=12)
    plt.xticks(rotation=45, ha='right')
    plt.tight_layout()
    
    output_path = os.path.join(OUTPUT_DIR, f"petclinic_correction_distance_comparison.png")
    plt.savefig(output_path)
    print(f"Correction distance box plot saved to: {output_path}")
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

    analyze_correction_distance(df_petclinic, llm_methods)
    generate_correction_distance_visualization(df_petclinic, llm_methods)

    print("\n--- Analysis for RQ2 Complete ---")

if __name__ == "__main__":
    main()
