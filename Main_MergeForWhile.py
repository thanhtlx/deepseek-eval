import pandas


def editDistDP(str1, str2, m, n):
    # Create a table to store results of subproblems
    dp = [[0 for x in range(n + 1)] for x in range(m + 1)]

    # Fill d[][] in bottom up manner
    for i in range(m + 1):
        for j in range(n + 1):

            # If first string is empty, only option is to
            # insert all characters of second string
            if i == 0:
                dp[i][j] = j  # Min. operations = j

            # If second string is empty, only option is to
            # remove all characters of second string
            elif j == 0:
                dp[i][j] = i  # Min. operations = i

            # If last characters are same, ignore last char
            # and recur for remaining string
            elif str1[i - 1] == str2[j - 1]:
                dp[i][j] = dp[i - 1][j - 1]

            # If last character are different, consider all
            # possibilities and find minimum
            else:
                dp[i][j] = 1 + min(dp[i][j - 1],  # Insert
                                   dp[i - 1][j],  # Remove
                                   dp[i - 1][j - 1])  # Replace

    return dp[m][n]

if __name__ == '__main__':
    df = pandas.read_csv("/Users/trangnt/Documents/Projects/Reliable_LLMs/Data/refactor_deepseek_6.7_java_.csv")
    functions = []
    compile = []
    for idx, row in df.iterrows():
        original =  df.at[idx, "function"].split()
        for2while = df.at[idx, "For2While"].split()
        while2for = df.at[idx, "While2For"].split()
        tmp1 = editDistDP(original, for2while, len(original), len(for2while))
        tmp2 = editDistDP(original, while2for, len(original), len(while2for))
        if tmp1 > tmp2:
            functions.append(df.at[idx, "For2While"])
            compile.append(df.at[idx, "For2WhileCheckCompilable"])
        else:
            functions.append(df.at[idx, "While2For"])
            compile.append(df.at[idx, "While2ForCheckCompilable"])
    df["ForWhileConvert"] = functions
    df["ForWhileConvertCheckCompilable"] = compile
    df.to_csv("Data/refactor_deepseek_6.7_java_v2.csv")