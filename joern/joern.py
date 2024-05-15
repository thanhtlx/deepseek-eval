from joern.file_manager import get_outer_dir, join_path, is_path_exist, mkdir_if_not_exist, get_file_name, remove_dir, unlink, write_file
from joern.helpers import get_logger, subprocess_cmd, get_current_timestamp, encode_special_characters_with_html_rules

CURRENT_DIR = get_outer_dir(__file__)
JOERN_SCRIPT_FUNCTION_PATH = join_path(CURRENT_DIR, "get_func_graph.scala")
JOERN_SCRIPT_FUNCTION_PATH = 'joern/get_func_graph.scala'
logger = get_logger(__name__)
BASE_DIR = '.'


def run_joern_text(function_text, output_dir, lang='java',fileName = ""):
    if is_path_exist(join_path(output_dir, fileName + f".{lang}.nodes.json")):
        print("Already parsed")
        return
    if function_text is None or isinstance(function_text,float):
        node_p = join_path(output_dir, fileName + f".{lang}.nodes.json")
        edge_p = join_path(output_dir, fileName + f".{lang}.edges.json")
        write_file(node_p,"[]")
        write_file(edge_p,"[]")
        return
    mkdir_if_not_exist(output_dir)
    cm_id = output_dir.rsplit("/")[-1]
    workspace_name = cm_id + str(get_current_timestamp())+fileName
    tmp_file = join_path(output_dir,fileName+f".{lang}")
    if not is_path_exist(tmp_file):
        with open(tmp_file, "w+") as f:
            f.write(function_text)
    mkdir_if_not_exist(output_dir)
    logger.info(f"Exporting joern graph [{output_dir}]")
    params = f"filepath={tmp_file},outputDir={output_dir},workspaceName={workspace_name}"
    command = f"joern --script {JOERN_SCRIPT_FUNCTION_PATH} --params='{params}'"
    print(command)
    logger.debug(command)
    stdout, stderr = subprocess_cmd(command)
    if "script finished successfully" not in stderr:
        logger.warning(f"[{output_dir}]{stderr}")
    workspace_dir = join_path(BASE_DIR, "workspace", workspace_name)
    try:
        remove_dir(workspace_dir)
    except Exception as e:
        logger.warning(f"Failed to remove workspace {workspace_dir}")
