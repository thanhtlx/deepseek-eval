from check_compile_java import check_compile_java
with open('Problem.java') as f:
    content = f.read()
print(check_compile_java(content))