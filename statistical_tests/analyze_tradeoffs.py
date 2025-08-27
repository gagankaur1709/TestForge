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
        
        # Create comprehensive method names including prompt strategies
        df_filtered['method'] = df_filtered.apply(lambda row: 
            row['generator_name'] if row['prompt_strategy'] is None or pd.isna(row['prompt_strategy'])
            else f"{row['generator_name']} ({row['prompt_strategy']})", axis=1)
        
        print(f"Found {len(df_filtered)} records for benchmark: '{benchmark_name}'")
        return df_filtered
        
    except Exception as e:
        print(f"Error loading data from database: {e}")
        return pd.DataFrame()

def create_summary_table(df: pd.DataFrame) -> pd.DataFrame:
    print(f"\n--- RQ3: Cost-Benefit Trade-off Analysis ---")

    successful_runs = df[df['runs_successfully'] == True]

    summary = successful_runs.groupby('method').agg(
        avg_time_cost=('time_cost', 'mean'),
        avg_token_cost=('token_cost', 'mean'),
        avg_line_coverage=('line_coverage', 'mean'),
        avg_cyclomatic_complexity=('cyclomatic_complexity', 'mean')
    ).reset_index()
    
    print("\n**Summary Table: Average Metrics for Successful Runs**")
    print("(Note: For Cyclomatic Complexity, a lower score is better)")
    print(summary.to_string(index=False))
    
    return summary

def generate_tradeoff_visualization(summary_df: pd.DataFrame):
    if summary_df.empty:
        print("Summary data is empty, cannot generate visualization.")
        return
        
    print("\n--- Generating Visualization for Cost-Benefit Trade-off ---")
    
    plt.figure(figsize=(12, 9))
    
    scatter = plt.scatter(
        summary_df['avg_time_cost'],
        summary_df['avg_cyclomatic_complexity'],
        s=300,
        c=range(len(summary_df)),
        cmap='viridis',
        alpha=0.7,
        edgecolors='black',
        linewidth=2
    )
    
    for i, method in enumerate(summary_df['method']):
        time_cost = summary_df['avg_time_cost'].iloc[i]
        complexity = summary_df['avg_cyclomatic_complexity'].iloc[i]
        coverage = summary_df['avg_line_coverage'].iloc[i]
        
        plt.annotate(
            f"{method}\n({time_cost:.1f}s, {complexity:.0f} complexity)",
            (summary_df['avg_time_cost'].iloc[i], summary_df['avg_cyclomatic_complexity'].iloc[i]),
            xytext=(10, 10),
            textcoords='offset points',
            fontsize=11,
            fontweight='bold',
            bbox=dict(boxstyle="round,pad=0.3", facecolor="white", alpha=0.8)
        )
    
    legend_elements = []
    for i, method in enumerate(summary_df['method']):
        time_cost = summary_df['avg_time_cost'].iloc[i]
        complexity = summary_df['avg_cyclomatic_complexity'].iloc[i]
        coverage = summary_df['avg_line_coverage'].iloc[i]
        
        legend_elements.append(plt.Line2D([0], [0], marker='o', color='w', 
                                        markerfacecolor=plt.cm.viridis(i/len(summary_df)),
                                        markersize=10, 
                                        label=f'{method}\nTime: {time_cost:.1f}s | Complexity: {complexity:.0f} | Coverage: {coverage:.1f}%'))
    
    plt.legend(handles=legend_elements, title='Generation Method Details', 
              bbox_to_anchor=(1.05, 1), loc='upper left', fontsize=9)
    
    plt.title(f"Cost vs. Maintainability Trade-off on {BENCHMARK_TO_ANALYZE}", fontsize=18, weight='bold')
    plt.xlabel("Average Time Cost (seconds) → (Worse)", fontsize=14)
    plt.ylabel("Average Cyclomatic Complexity → (Worse)", fontsize=14)
    plt.grid(True, which='both', linestyle='--', linewidth=0.5)
    
    plt.axhline(y=summary_df['avg_cyclomatic_complexity'].median(), color='grey', linestyle='--', linewidth=1, alpha=0.7)
    plt.axvline(x=summary_df['avg_time_cost'].median(), color='grey', linestyle='--', linewidth=1, alpha=0.7)
    
    output_path = os.path.join(OUTPUT_DIR, "cost_benefit_tradeoff_plot.png")
    plt.savefig(output_path, dpi=300, bbox_inches='tight')
    print(f"Trade-off plot saved to: {output_path}")
    plt.close()

def generate_financial_tradeoff_plot(summary_df: pd.DataFrame):
    llm_summary = summary_df[summary_df['avg_token_cost'] > 0]
    
    if llm_summary.empty:
        print("No LLM data with token costs found, skipping financial trade-off plot.")
        return
        
    print("\n--- Generating Financial Trade-off Visualization ---")
    
    plt.figure(figsize=(12, 8))
    
    bubble_sizes = llm_summary['avg_cyclomatic_complexity'] * 20  
    scatter = plt.scatter(
        llm_summary['avg_token_cost'],
        llm_summary['avg_line_coverage'],
        s=bubble_sizes,
        c=range(len(llm_summary)),
        cmap='viridis',
        alpha=0.7,
        edgecolors='black',
        linewidth=2
    )
    
    # Add method labels
    for i, method in enumerate(llm_summary['method']):
        token_cost = llm_summary['avg_token_cost'].iloc[i]
        coverage = llm_summary['avg_line_coverage'].iloc[i]
        complexity = llm_summary['avg_cyclomatic_complexity'].iloc[i]
        
        method_short = method.split('(')[-1].replace(')', '') if '(' in method else method
        
        plt.annotate(
            f"{method_short}\n({token_cost:.0f} tokens)",
            (token_cost, coverage),
            xytext=(10, 10),
            textcoords='offset points',
            fontsize=11,
            fontweight='bold',
            bbox=dict(boxstyle="round,pad=0.3", facecolor="white", alpha=0.8),
            ha='left'
        )
    
    plt.title(f"Token Cost vs Coverage Effectiveness on {BENCHMARK_TO_ANALYZE}\n(Bubble size = Cyclomatic Complexity)", fontsize=16, weight='bold')
    plt.xlabel("Average Token Cost (tokens)", fontsize=14)
    plt.ylabel("Average Line Coverage (%)", fontsize=14)
    plt.grid(True, alpha=0.3)
    
    plt.axhline(y=llm_summary['avg_line_coverage'].median(), color='grey', linestyle='--', alpha=0.5, label='Median Coverage')
    plt.axvline(x=llm_summary['avg_token_cost'].median(), color='grey', linestyle='--', alpha=0.5, label='Median Cost')
    plt.legend()
    
    plt.tight_layout()
    
    output_path = os.path.join(OUTPUT_DIR, "token_cost_vs_coverage.png")
    plt.savefig(output_path, dpi=300, bbox_inches='tight')
    print(f"Token Cost vs Coverage plot saved to: {output_path}")
    plt.close()

def main():
    df_petclinic = load_and_prepare_data(BENCHMARK_TO_ANALYZE)
    if df_petclinic.empty: return
        
    summary_data = create_summary_table(df_petclinic)
    generate_tradeoff_visualization(summary_data)
    generate_financial_tradeoff_plot(summary_data)

    print("\n--- Analysis for RQ3 Complete ---")

if __name__ == "__main__":
    main()
