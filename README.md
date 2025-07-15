# LLM-Generated Integration Testing Research Framework

This repository contains a comprehensive Python application for conducting research on LLM-generated integration tests, comparing them against traditional automated tools like EvoSuite.

## Research Overview

This study investigates whether advanced LLM prompting techniques can produce high-quality integration tests that are not only correct and effective at finding bugs but are also easy for developers to maintain.

### Research Questions (RQs)

- **RQ1**: Which approach—advanced LLM prompting or a traditional automated tool—generates more effective integration tests in terms of bug-finding ability and code coverage?
- **RQ2**: How does the maintainability of LLM-generated integration tests compare to those from traditional tools?
- **RQ3**: What are the associated resource costs (generation time, computational expense, and required human effort) for creating integration tests with each approach?
- **RQ4**: What is the overall cost-benefit trade-off, and do the quality improvements justify their higher costs for integration testing?

## Project Structure

```
gxk484/
├── src/
│   ├── core/                 # Core framework components
│   ├── llm/                  # LLM integration and prompting
│   ├── traditional/          # Traditional tool integration (EvoSuite)
│   ├── metrics/              # Effectiveness and maintainability metrics
│   ├── analysis/             # Cost-benefit analysis
│   └── utils/                # Utility functions
├── experiments/              # Experiment configurations and results
├── benchmarks/               # Benchmark applications (e.g., CargoTracker)
├── tests/                    # Unit tests for the framework
├── requirements.txt          # Python dependencies
├── config.yaml              # Configuration file
└── main.py                  # Main application entry point
```

## Features

### Core Framework
- **Plug-and-play LLM integration** supporting multiple models (GPT-4o, Claude, etc.)
- **Traditional tool integration** with EvoSuite
- **Flexible experiment configuration** system
- **Automated test generation** pipeline

### Effectiveness Metrics (RQ1)
- **Fault Detection Rate**: Percentage of pre-seeded integration bugs found
- **Code Coverage**: Line and branch coverage across components
- **Test Quality Assessment**: Automated evaluation of test effectiveness

### Maintainability Metrics (RQ2)
- **Code Complexity Analysis**: Cyclomatic and Cognitive Complexity measurement
- **Structural Coupling Metrics**: Mock count and Coupling Between Objects (CBO)
- **Change Impact Analysis**: Automated brittleness testing

### Cost Metrics (RQ3)
- **Time Cost**: Generation time measurement
- **Computational Cost**: Token usage and API call tracking
- **Human Effort**: Guidance time measurement for human-in-the-loop techniques

### Analysis (RQ4)
- **Comprehensive cost-benefit analysis**
- **Statistical significance testing**
- **Practical guidance generation**

## Installation

```bash
# Clone the repository
git clone <repository-url>
cd gxk484

# Create virtual environment
python -m venv venv
source venv/bin/activate  # On Windows: venv\Scripts\activate

# Install dependencies
pip install -r requirements.txt

# Set up configuration
cp config.yaml.example config.yaml
# Edit config.yaml with your API keys and settings
```

## Usage

### Basic Usage

```python
from src.main import ResearchFramework

# Initialize the framework
framework = ResearchFramework()

# Run a complete experiment
results = framework.run_experiment(
    benchmark_app="cargotracker",
    llm_model="gpt-4o",
    traditional_tool="evosuite"
)

# Analyze results
analysis = framework.analyze_results(results)
framework.generate_report(analysis)
```

### Custom Experiments

```python
from src.core.experiment import ExperimentConfig
from src.metrics.effectiveness import EffectivenessMetrics

# Configure custom experiment
config = ExperimentConfig(
    benchmark_app="your-app",
    llm_prompting_strategy="advanced",
    traditional_tool="evosuite",
    metrics=[EffectivenessMetrics.FAULT_DETECTION, EffectivenessMetrics.CODE_COVERAGE]
)

# Run experiment
results = framework.run_custom_experiment(config)
```

## Configuration

Edit `config.yaml` to configure:

- **LLM Settings**: API keys, models, prompting strategies
- **Traditional Tools**: EvoSuite configuration
- **Benchmarks**: Target applications and bug seeding
- **Metrics**: Which metrics to collect and analyze
- **Output**: Results storage and reporting preferences

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Add tests for new functionality
5. Submit a pull request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Citation

If you use this framework in your research, please cite:

```bibtex
@article{llm-integration-testing-2024,
  title={LLM-Generated Integration Testing: A Cost-Benefit Analysis},
  author={Your Name},
  journal={Journal of Software Engineering},
  year={2024}
}
```
