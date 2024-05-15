import py_compile
import subprocess

def check_compile_java(source):
    tmp_file = 'temp/Problem.java'
    with open(tmp_file,'w+') as f:
        f.write(source)
    cmd = f"javac -cp javatuples-1.2.jar {tmp_file}"
    try:
        compilation_result = subprocess.run(cmd, timeout=60, capture_output=True, shell=True)  
        if compilation_result.stderr:
            print(compilation_result.stderr)
            return 0
        return 1
    except:
        return 0
