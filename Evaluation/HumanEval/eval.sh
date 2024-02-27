MODEL_NAME_OR_PATH="deepseek/deepseek-coder-1b"
DATASET_ROOT="data/"
LANGUAGE="cpp"
python -m accelerate.commands.launch --config_file test_config.yaml eval_pal.py --logdir ${MODEL_NAME_OR_PATH} --language ${LANGUAGE} --dataroot ${DATASET_ROOT}