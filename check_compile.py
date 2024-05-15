
from check_compile_java import check_compile_java
from check_compile_py import check_compile_py
from tqdm import tqdm
import pandas as pd 


df = pd.read_csv('refactor_human_eval_chatgpt_python.csv')
result = list()
columns = ['RenameVariable','For2While','While2For','ReverseIf','ReorderParameter','ChangeCondition','RemoveConditionStatement','ChangeOperator','RemoveDefStatement']


for _,row in tqdm(df.iterrows()):
    code = row['code']
    import_code  = [l for l in code.splitlines() if l.startswith('import')] 
    import_code = '\n'.join(import_code) + '\n'
    for cl in columns:
        is_compiable = check_compile_py(import_code + row[cl])
        row[cl+'CheckCompilable'] = is_compiable
    result.append(row)
dfs = pd.DataFrame(result)
dfs.to_csv('check_refactor_human_eval_chatgpt_python.csv',index=False)