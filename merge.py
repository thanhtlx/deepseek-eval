
import pandas as pd 
df = pd.read_csv("human_eval\\java\\human_eval_chatgpt_java.csv")
root = "human_eval\\java\\chatgpt"
refactors = [[],[],[],[],[],[],[],[],[],[]]
lang = 'java'
import os
from tqdm import tqdm
for _,row in tqdm(df.iterrows()):
    for i in range(1,10):
        idx = i # java 1-9, py 0-8
        p = f'{root}\\{idx}\\{row["task_id"].replace("/","_")}.{lang}'
        print(p)
        if os.path.exists(p):
            with open(p) as f:
                refactors[i].append(f.read())
        else:
            print('not exits')
            refactors[i].append(row['function'])
df['RenameVariable'] = refactors[1]
df['For2While'] = refactors[2]
df['While2For'] = refactors[3]
df['ReverseIf'] = refactors[4]
df['ReorderParameter'] = refactors[5]
df['ChangeCondition'] = refactors[6]
df['RemoveConditionStatement'] = refactors[7]
df['ChangeOperator'] = refactors[8]
df['RemoveDefStatement'] = refactors[9]


df.to_csv(f'refactor_human_eval_chatgpt_{lang}.csv',index=False)