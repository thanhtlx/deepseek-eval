
import py_compile
def check_compile_py(source):
    tmp_file = 'temp/temp.py'
    with open(tmp_file,'w+') as f:
        f.write(source)
    result = py_compile.compile(tmp_file,quiet=2,doraise=False)
    return 1 if result else 0
