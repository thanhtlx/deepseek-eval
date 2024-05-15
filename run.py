
# import parallelTestModule

import os
# os.chdir('Evaluation/HumanEval/')
from Evaluation.HumanEval.human_eval.evaluation import evaluate_functional_correctness

language = 'java'
log_dir='tmp_dir'
runlang=language
timeout = 100
data_root ='data/'
file_res = f'human_eval\\{language}\\result_{language}.jsonl'
if __name__ == "__main__":
    # extractor = parallelTestModule.ParallelExtractor()
    # extractor.runInParallel(numProcesses=2, numThreads=4)
    res = evaluate_functional_correctness(input_file=file_res, problem_file=os.path.join(data_root, f"humaneval-{language}.jsonl"), tmp_dir=log_dir, timeout=timeout, language=runlang)