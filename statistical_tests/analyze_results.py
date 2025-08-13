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

def choose_and_run_statistical_test(df: pd.DataFrame, metric: str):
    print(f"\n--- Performing Statistical Analysis for Metric: '{metric}' ---")
    strategies = df['prompt_strategy'].unique()
    data_groups = [df[df['prompt_strategy'] == s][metric].dropna() for s in strategies]
    group_names = strategies.tolist()

    if len(data_groups) > 1:
        is_parametric = check_normality(data_groups, group_names)
        
        if is_parametric and len(data_groups) == 2:
            print(f"\n  Using Independent Samples T-Test (parametric):")
            statistic, p_value = stats.ttest_ind(data_groups[0], data_groups[1])
            print(f"  T-statistic: {statistic:.4f}")
            print(f"  P-value: {p_value:.4f}")
            
        elif is_parametric and len(data_groups) > 2:
            print(f"\n  Using One-Way ANOVA (parametric):")
            statistic, p_value = stats.f_oneway(*data_groups)
            print(f"  F-statistic: {statistic:.4f}")
            print(f"  P-value: {p_value:.4f}")
            
        else:
            print(f"\n  Using Kruskal-Wallis H-Test (non-parametric):")
            h_statistic, p_value = stats.kruskal(*data_groups)
            print(f"  H-statistic: {h_statistic:.4f}")
            print(f"  P-value: {p_value:.4f}")

        if p_value < SIGNIFICANCE_LEVEL:
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
                    except ImportError:
                        print("  Warning: statsmodels not available. Using Dunn's test instead.")
                        dunn_results = sp.posthoc_dunn(df, val_col=metric, group_col='prompt_strategy', p_adjust='bonferroni')
                        print("  Dunn's Test P-values (Bonferroni corrected):")
                        print(dunn_results)
                else:
                    print("  Using Dunn's Test (non-parametric):")
                    dunn_results = sp.posthoc_dunn(df, val_col=metric, group_col='prompt_strategy', p_adjust='bonferroni')
                    print("  Dunn's Test P-values (Bonferroni corrected):")
                    print(dunn_results)
        else:
            print("  => Result is NOT statistically significant (p >= 0.05).")
            print("     There is no significant difference between the prompt strategies for this metric.")
    else:
        print("  Not enough groups to perform statistical test.")


def generate_visualizations(df: pd.DataFrame, metric: str):
    print(f"\n--- Generating Visualization for Metric: '{metric}' ---")
    
    plt.figure(figsize=(12, 8))
    sns.boxplot(data=df, x='prompt_strategy', y=metric)
    
    plt.title(f"Comparison of Prompt Strategies for '{metric}' on {BENCHMARK_TO_ANALYZE}", fontsize=16)
    plt.xlabel("Prompt Strategy", fontsize=12)
    plt.ylabel(metric.replace('_', ' ').title(), fontsize=12)
    plt.xticks(rotation=45, ha='right')
    plt.tight_layout()
    
    output_path = os.path.join(OUTPUT_DIR, f"{metric}_comparison.png")
    plt.savefig(output_path)
    print(f"Box plot saved to: {output_path}")
    plt.close()


def main():
    df_humaneval = load_data_from_db(BENCHMARK_TO_ANALYZE)
    if df_humaneval.empty: return

    metrics_to_analyze = ['runs_successfully', 'line_coverage', 'cyclomatic_complexity']
    for metric in metrics_to_analyze:
        if metric in df_humaneval.columns:
            choose_and_run_statistical_test(df_humaneval, metric)
            generate_visualizations(df_humaneval, metric)
        else:
            print(f"\nWarning: Metric '{metric}' not found. Skipping analysis.")
    print("\n--- Analysis Complete ---")

if __name__ == "__main__":
    main()
