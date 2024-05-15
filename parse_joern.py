from joern.joern import run_joern_text
# def run_joern_text(function_text, output_dir, lang='java',fileName = ""):
import pandas as pd
import os  
df = pd.read_csv('check_refactor_human_eval_chatgpt_java.csv')
for _,row in df.iterrows():
    lang = 'java'
    root = f'joern\\output\\{lang}'
    file_name = row['task_id'].replace('/','_')
    output_path = os.path.join(root,file_name)
    run_joern_text(row['function'],output_path,lang,file_name)