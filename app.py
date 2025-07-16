# Main Flask application file (entry point)

from flask import Flask, render_template
from config import Config
from database import init_db, get_all_experiments

init_db()

app = Flask(__name__)
app.config.from_object(Config)

@app.route('/')
def index():
    experiments = get_all_experiments()
    return render_template('index.html', experiments=experiments)

# ... (Other routes for running experiments will go here) ...