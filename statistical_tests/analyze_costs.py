import pandas as pd
import sqlite3
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

def load_and_prepare_data(benchmark_name: str) -> pd.DataFrame:
    print(f"Loading data from database: {DB_PATH}")
    try:
        conn = sqlite3.connect(DB_PATH)
        df = pd.read_sql_query("SELECT * FROM experiments", conn)
        conn.close()
        
        print(f"Successfully loaded {len(df)} total records.")
        df_filtered = df[df['benchmark_name'] == benchmark_name].copy()
        
        df_filtered['method'] = df_filtered['generator_name'].apply(lambda x: x.split(' ')[0])
        
        print(f"Found {len(df_filtered)} records for benchmark: '{benchmark_name}'")
        return df_filtered
        
    except Exception as e:
        print(f"Error loading data from database: {e}")
        return pd.DataFrame()

def create_summary_table(df: pd.DataFrame):
    print(f"\n--- RQ3: Cost-Benefit Trade-off Analysis ---")

    cost_metrics = ['time_cost', 'token_cost']
    benefit_metrics = ['line_coverage', 'cyclomatic_complexity']

    successful_runs = df[df['runs_successfully'] == True]

    summary = successful_runs.groupby('method')[cost_metrics + benefit_metrics].mean().reset_index()
    
    print("\n**Summary Table: Average Metrics for Successful Runs**")
    print("(Note: For Cyclomatic Complexity, a lower score is better)")
    print(summary.to_string(index=False))
    
    return summary

def generate_tradeoff_visualization(summary_df: pd.DataFrame):
    if summary_df.empty:
        print("Summary data is empty, cannot generate visualization.")
        return
        
    print("\n--- Generating Visualization for Cost-Benefit Trade-off ---")
    
    plt.figure(figsize=(12, 8))
    
    plot = sns.scatterplot(
        data=summary_df,
        x='time_cost',
        y='cyclomatic_complexity',
        hue='method',
        s=200, 
        style='method',
        palette='viridis',
        edgecolor='black'
    )
    
    plt.title(f"Cost-Benefit Trade-off on {BENCHMARK_TO_ANALYZE}", fontsize=18, weight='bold')
    plt.xlabel("Average Time Cost (seconds) - Lower is Better", fontsize=14)
    plt.ylabel("Average Cyclomatic Complexity - Lower is Better", fontsize=14)
    plt.legend(title='Generation Method', bbox_to_anchor=(1.05, 1), loc='upper left')
    plt.grid(True, which='both', linestyle='--', linewidth=0.5)
    plt.tight_layout()

    for i in range(summary_df.shape[0]):
        plt.text(
            x=summary_df.time_cost[i] + 0.1, 
            y=summary_df.cyclomatic_complexity[i] + 0.1, 
            s=summary_df.method[i], 
            fontdict=dict(color='black', size=10)
        )
    
    output_path = os.path.join(OUTPUT_DIR, "cost_benefit_tradeoff_plot.png")
    plt.savefig(output_path)
    print(f"Trade-off plot saved to: {output_path}")
    plt.close()


def main():
    df_petclinic = load_and_prepare_data(BENCHMARK_TO_ANALYZE)

    if df_petclinic.empty:
        print("No data found for the specified benchmark. Exiting analysis.")
        return
        
    summary_data = create_summary_table(df_petclinic)
    
    generate_tradeoff_visualization(summary_data)

    print("\n--- Analysis for RQ3 Complete ---")

if __name__ == "__main__":
    main()
