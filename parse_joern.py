from joern.joern import run_joern_text
# def run_joern_text(function_text, output_dir, lang='java',fileName = ""):
import pandas as pd
import os  
import json
    
    
# import 
import argparse
def run(args):
    df = pd.read_csv(args.file)
    df = df.sample(frac=1)

    for _,row in df.iterrows():
        root = f'{args.output}/{args.lang}'
        file_name = row['task_id'].replace('/','_')
        output_path = os.path.join(root,file_name)
        run_joern_text(row['function'],output_path,args.lang,file_name)

def merge(args):
    df = pd.read_csv(args.file)
    result = list()
    for _,row in df.iterrows():
        root = f'{args.output}/{args.lang}'
        file_name = row['task_id'].replace('/','_')
        node_path = f'{root}/{file_name}/{file_name}.{args.lang}.nodes.json'
        edge_path = f'{root}/{file_name}/{file_name}.{args.lang}.edges.json'
        with open(edge_path) as f:
            edges = json.dumps(json.load(f))
        with open(node_path) as f:
            nodes = json.dumps(json.load(f))
        row['nodes'] = nodes
        row['edges'] = edges
        result.append(row)
    dfs = pd.DataFrame(result)
    dfs.to_csv(f'joern_{args.file}',index=False)

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--file", default='refactor_human_eval_chatgpt_java.csv')
    parser.add_argument("--lang", type=str, default="java")
    parser.add_argument("--output", type=str, default="joern/output")
    parser.add_argument("--mode", type=str, default="parse")
    args = parser.parse_args()
    if args.mode != "parse":
        merge(args)
    else:
        run(args)