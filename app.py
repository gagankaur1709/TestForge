# Main Flask application file (entry point)
from flask import Flask, render_template, request, redirect, url_for, flash
from config import Config
from database import init_db, get_all_experiments, add_experiment_result, get_statistical_results
from run_experiment import run_experiment
import threading
import subprocess
import os

init_db()

app = Flask(__name__)
app.config.from_object(Config)
app.secret_key = app.config['SECRET_KEY']

@app.route('/')
def index():
    try:
        experiments = get_all_experiments()
        statistical_results = get_statistical_results()
        return render_template('index.html', experiments=experiments, statistical_results=statistical_results)
    except Exception as e:
        flash(f"Error fetching experiments: {e}", "danger")
        return render_template('index.html', experiments=[], statistical_results=[])

@app.route('/run', methods=('GET', 'POST'))
def run():
    if request.method == 'POST':
        experiment_type = request.form.get('experiment_type', 'individual')
        
        if experiment_type == 'individual':
            generator_name = request.form['generator_name']
            model_name = request.form['model_name']
            prompt_strategy = request.form['prompt_strategy']
            benchmark_name = request.form['benchmark_name']
            scenario_name = request.form.get('scenario_name', '')

            thread = threading.Thread(
                target=run_experiment,
                args=(generator_name, model_name, prompt_strategy, benchmark_name, scenario_name)
            )
            thread.start()

            flash(f"Started individual experiment with {model_name} on {benchmark_name}. Results will appear on the dashboard.", "success")
        
        elif experiment_type == 'full_suite':
            benchmark_name = request.form['benchmark_name']
            
            thread = threading.Thread(
                target=run_full_experiment_suite,
                args=(benchmark_name,)
            )
            thread.start()

            flash(f"Started full experiment suite for {benchmark_name}. This may take several hours.", "success")
        
        elif experiment_type == 'statistical_analysis':
            analysis_type = request.form['analysis_type']
            
            thread = threading.Thread(
                target=run_statistical_analysis,
                args=(analysis_type,)
            )
            thread.start()

            flash(f"Started {analysis_type} analysis. Results will be saved to analysis_results/ directory.", "success")
        
        return redirect(url_for('index'))

    models_by_provider = {
        "Google Gemini": ["gemini-1.5-pro-latest", "gemini-1.5-flash-latest"],
        "Groq Llama": ["llama3-70b-8192", "llama3-8b-8192"],
        "DeepSeek": ["deepseek-coder-v2-instruct"],
        "Randoop": ["N/A"]
    }
    
    benchmarks = ["spring-petclinic", "humaneval"]
    prompt_strategies = ["chain_of_thought", "guided_tree_of_thought", "constraint_based", "role_playing"]
    humaneval_strategies = ["humaneval_chain_of_thought", "humaneval_guided_tree_of_thought", "humaneval_constraint_based", "humaneval_role_playing"]
    
    return render_template('run_experiment.html', 
                         models_by_provider=models_by_provider,
                         benchmarks=benchmarks,
                         prompt_strategies=prompt_strategies,
                         humaneval_strategies=humaneval_strategies)

def run_full_experiment_suite(benchmark_name):
    try:
        subprocess.run(['python', 'main_runner.py', '--benchmark', benchmark_name], 
                      check=True, capture_output=True, text=True)
    except subprocess.CalledProcessError as e:
        print(f"Error running full experiment suite: {e}")

def run_statistical_analysis(analysis_type):
    try:
        if analysis_type == 'humaneval':
            subprocess.run(['python', 'statistical_tests/analyze_results.py'], 
                          check=True, capture_output=True, text=True)
        elif analysis_type == 'petclinic':
            subprocess.run(['python', 'statistical_tests/analyze_petclinic.py'], 
                          check=True, capture_output=True, text=True)
        elif analysis_type == 'tradeoffs':
            subprocess.run(['python', 'statistical_tests/analyze_tradeoffs.py'], 
                          check=True, capture_output=True, text=True)
        elif analysis_type == 'correction_distance':
            subprocess.run(['python', 'calculate_correction_distances.py'], 
                          check=True, capture_output=True, text=True)
    except subprocess.CalledProcessError as e:
        print(f"Error running statistical analysis: {e}")

if __name__ == '__main__':
    app.run(debug=True)
