# Main Flask application file (entry point)
from flask import Flask, render_template, request, redirect, url_for, flash
from config import Config
from database import init_db, get_all_experiments, add_experiment_result
from run_experiment import run_experiment
import threading

init_db()

app = Flask(__name__)
app.config.from_object(Config)
app.secret_key = 'a_super_secret_key_for_flashing_messages' # Needed for flash messages

@app.route('/')
def index():
    """
    The main dashboard page.
    """
    try:
        experiments = get_all_experiments()
        return render_template('index.html', experiments=experiments)
    except Exception as e:
        flash(f"Error fetching experiments: {e}", "danger")
        return render_template('index.html', experiments=[])

@app.route('/run', methods=('GET', 'POST'))
def run():
    """
    This page displays a form to start a new experiment. 
    """
    if request.method == 'POST':
        generator_name = request.form['generator_name']
        prompt_strategy = request.form['prompt_strategy']
        benchmark_name = request.form['benchmark_name']

        # Run the experiment in a background thread so the UI doesn't freeze
        # This is important because your experiment can take a long time to run.
        thread = threading.Thread(
            target=run_experiment,
            args=(generator_name, prompt_strategy, benchmark_name)
        )
        thread.start()

        flash(f"Started experiment for {benchmark_name} with {generator_name} and strategy '{prompt_strategy}'. Results will appear on the dashboard shortly.", "success")
        return redirect(url_for('index'))

    return render_template('run_experiment.html')

if __name__ == '__main__':
    app.run(debug=True)
