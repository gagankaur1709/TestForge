import pandas as pd
import sqlite3
import scipy.stats as stats
import scikit_posthocs as sp
import matplotlib.pyplot as plt
import seaborn as sns
import os
import sys
import json

sys.path.append(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from config import Config
from database import add_statistical_result

DB_PATH = Config.DATABASE_PATH
OUTPUT_DIR = "analysis_results"
BENCHMARK_TO_ANALYZE = "humaneval"
SIGNIFICANCE_LEVEL = 0.05

os.makedirs(OUTPUT_DIR, exist_ok=True)

def load_data_from_db(benchmark_name: str) -> pd.DataFrame:
    print(f"Loading data from database: {DB_PATH}")
    try:
        conn = sqlite3.connect(DB_PATH)
        df = pd.read_sql_query("SELECT * FROM experiments", conn)
        conn.close()
        
        print(f"Successfully loaded {len(df)} total records.")
        df_filtered = df[df['benchmark_name'] == benchmark_name].copy()
        
        if 'runs_successfully' in df_filtered.columns:
            df_filtered['runs_successfully'] = df_filtered['runs_successfully'].astype(int)
            
        print(f"Found {len(df_filtered)} records for benchmark: '{benchmark_name}'")
        return df_filtered
        
    except Exception as e:
        print(f"Error loading data from database: {e}")
        return pd.DataFrame()

def check_normality(data_groups: list, group_names: list) -> bool:
    print("\nChecking for normality using Shapiro-Wilk test...")
    is_parametric = True
    for i, group_data in enumerate(data_groups):
        if len(group_data) < 3: 
            print(f"  - Group '{group_names[i]}' has too few samples (<3) to test normality. Assuming non-parametric.")
            is_parametric = False
            continue
            
        stat, p_value = stats.shapiro(group_data)
        print(f"  - Group '{group_names[i]}': p-value = {p_value:.4f}")
        if p_value < SIGNIFICANCE_LEVEL:
            print("    -> Data is NOT normally distributed (non-parametric).")
            is_parametric = False
        else:
            print("    -> Data IS normally distributed (parametric).")
    
    return is_parametric

def choose_and_run_statistical_test(df: pd.DataFrame, metric: str, analysis_stage: str = "unknown"):
    print(f"\n--- Performing Statistical Analysis for Metric: '{metric}' ---")
    strategies = df['prompt_strategy'].unique()
    data_groups = [df[df['prompt_strategy'] == s][metric].dropna() for s in strategies]
    group_names = strategies.tolist()
    
    test_type = ""
    test_statistic = None
    p_value = None
    posthoc_results = None

    if len(data_groups) > 1:
        is_parametric = check_normality(data_groups, group_names)
        
        if is_parametric and len(data_groups) == 2:
            test_type = "Independent Samples T-Test"
            print(f"\n  Using {test_type} (parametric):")
            statistic, p_value = stats.ttest_ind(data_groups[0], data_groups[1])
            test_statistic = statistic
            print(f"  T-statistic: {statistic:.4f}")
            print(f"  P-value: {p_value:.4f}")
            
        elif is_parametric and len(data_groups) > 2:
            test_type = "One-Way ANOVA"
            print(f"\n  Using {test_type} (parametric):")
            statistic, p_value = stats.f_oneway(*data_groups)
            test_statistic = statistic
            print(f"  F-statistic: {statistic:.4f}")
            print(f"  P-value: {p_value:.4f}")
            
        else:
            test_type = "Kruskal-Wallis H-Test"
            print(f"\n  Using {test_type} (non-parametric):")
            h_statistic, p_value = stats.kruskal(*data_groups)
            test_statistic = h_statistic
            print(f"  H-statistic: {h_statistic:.4f}")
            print(f"  P-value: {p_value:.4f}")

        is_significant = p_value < SIGNIFICANCE_LEVEL
        
        if is_significant:
            print("  => Result is STATISTICALLY SIGNIFICANT (p < 0.05).")
            print("     There is a significant difference between at least two prompt strategies.")
            
            if len(data_groups) > 2:
                print("\n  Running Post-Hoc Test to find which pairs differ...")
                if is_parametric:
                    print("  Using Tukey's HSD Test (parametric):")
                    try:
                        from statsmodels.stats.multicomp import pairwise_tukeyhsd
                        tukey = pairwise_tukeyhsd(df[metric].dropna(), df['prompt_strategy'].dropna())
                        print(tukey)
                        posthoc_results = str(tukey)
                    except ImportError:
                        print("  Warning: statsmodels not available. Using Dunn's test instead.")
                        dunn_results = sp.posthoc_dunn(df, val_col=metric, group_col='prompt_strategy', p_adjust='bonferroni')
                        print("  Dunn's Test P-values (Bonferroni corrected):")
                        print(dunn_results)
                        posthoc_results = dunn_results.to_json()
                else:
                    print("  Using Dunn's Test (non-parametric):")
                    dunn_results = sp.posthoc_dunn(df, val_col=metric, group_col='prompt_strategy', p_adjust='bonferroni')
                    print("  Dunn's Test P-values (Bonferroni corrected):")
                    print(dunn_results)
                    posthoc_results = dunn_results.to_json()
        else:
            print("  => Result is NOT statistically significant (p >= 0.05).")
            print("     There is no significant difference between the prompt strategies for this metric.")
        
        total_sample_size = sum(len(group) for group in data_groups)
        result_data = {
            'benchmark_name': BENCHMARK_TO_ANALYZE,
            'metric_name': metric,
            'test_type': test_type,
            'test_statistic': test_statistic,
            'p_value': p_value,
            'is_significant': is_significant,
            'significance_level': SIGNIFICANCE_LEVEL,
            'sample_size': total_sample_size,
            'group_names': json.dumps(group_names),
            'posthoc_results': posthoc_results,
            'analysis_stage': analysis_stage
        }
        add_statistical_result(result_data)
        
    else:
        print("  Not enough groups to perform statistical test.")


def generate_visualizations(df: pd.DataFrame, metric: str):
    print(f"\n--- Generating Visualization for Metric: '{metric}' ---")
    
    plt.figure(figsize=(12, 8))
    
    if metric == 'runs_successfully':
        success_rates = df.groupby('prompt_strategy')[metric].agg(['count', 'sum', 'mean']).round(4)
        success_rates.columns = ['Total_Experiments', 'Successful_Runs', 'Success_Rate']
        success_rates = success_rates.sort_values('Success_Rate', ascending=False)
        
        bars = plt.bar(range(len(success_rates)), success_rates['Success_Rate'], 
                      color=['#2E8B57', '#4682B4', '#CD853F', '#DC143C'])
        
        plt.title(f"Success Rates by Prompt Strategy on {BENCHMARK_TO_ANALYZE}", fontsize=16)
        plt.xlabel("Prompt Strategy", fontsize=12)
        plt.ylabel("Success Rate", fontsize=12)
        plt.xticks(range(len(success_rates)), success_rates.index, rotation=45, ha='right')
        
        for i, (bar, rate) in enumerate(zip(bars, success_rates['Success_Rate'])):
            plt.text(bar.get_x() + bar.get_width()/2, bar.get_height() + 0.01, 
                    f'{rate:.1%}', ha='center', va='bottom', fontweight='bold')
        
        for i, (bar, total) in enumerate(zip(bars, success_rates['Total_Experiments'])):
            plt.text(bar.get_x() + bar.get_width()/2, -0.02, 
                    f'n={total}', ha='center', va='top', fontsize=10)
        
        plt.ylim(-0.05, 1.05)
        
    else:
        sns.boxplot(data=df, x='prompt_strategy', y=metric)
        plt.title(f"Comparison of Prompt Strategies for '{metric}' on {BENCHMARK_TO_ANALYZE}", fontsize=16)
        plt.xlabel("Prompt Strategy", fontsize=12)
        plt.ylabel(metric.replace('_', ' ').title(), fontsize=12)
        plt.xticks(rotation=45, ha='right')
    
    plt.tight_layout()
    
    output_path = os.path.join(OUTPUT_DIR, f"{metric}_comparison.png")
    plt.savefig(output_path)
    print(f"Visualization saved to: {output_path}")
    plt.close()

def main():
    df_full = load_data_from_db(BENCHMARK_TO_ANALYZE)

    if df_full.empty:
        print("No data found for the specified benchmark. Exiting analysis.")
        return

    print("\n\n--- STAGE 1: Analyzing Success Rate (All Experiments) ---")
    success_metric = 'runs_successfully'
    if success_metric in df_full.columns:
        choose_and_run_statistical_test(df_full, success_metric, "Stage 1 - Success Rate")
        generate_visualizations(df_full, success_metric)
    else:
        print(f"\nWarning: Metric '{success_metric}' not found. Cannot analyze success rate.")

    print("\n\n--- STAGE 2: Analyzing Quality & Maintainability (Successful Experiments Only) ---")
    
    df_successful = df_full[df_full['runs_successfully'] == 1].copy()
    
    if df_successful.empty:
        print("No successful runs found. Cannot perform Stage 2 analysis.")
        return
        
    print(f"Found {len(df_successful)} successful experiments to analyze for quality.")

    quality_metrics_to_analyze = [
        'line_coverage',
        'branch_coverage',
        'cyclomatic_complexity'
    ]

    for metric in quality_metrics_to_analyze:
        if metric in df_successful.columns:
            choose_and_run_statistical_test(df_successful, metric, "Stage 2 - Quality Metrics")
            generate_visualizations(df_successful, metric)
        else:
            print(f"\nWarning: Metric '{metric}' not found in the database. Skipping analysis.")

    print("\n--- Analysis Complete ---")

if __name__ == "__main__":
    main()
