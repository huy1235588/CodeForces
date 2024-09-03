import re
# Xác định các dòng cần loại trừ
exclude_lines = [
    "const inputField = document.getElementById('input-form');\n",
    "const output = document.getElementById('output');\n",
]

# Sử dụng biểu thức chính quy để thay thế 'output.textContent' bằng 'print'
def modify_js_code(js_code):
    modified_code = re.sub(r'output\.textContent\s*=\s*"([^"]*)";', r'print("\1");', js_code)
    modified_code = re.sub(r'function\s+onSubmit\s*\(event\)\s*{', 'function main() {', modified_code)
    modified_code = re.sub(r'var\s+input\s*=\s*inputField\.value;', 'var input = readline();', modified_code)
    return modified_code

def remove_line(js_code, line_to_remove):
    # Xóa dòng chứa `line_to_remove`
    lines = js_code.splitlines()
    modified_lines = [line for line in lines if line_to_remove not in line]
    return "\n".join(modified_lines)

# Lấy ra các dòng không có trong exclude_lines
def get_OnSubmit_code(js_code):
    modified_code = ""
    # Đoạn mã JS mới
    for line in js_code:
        if line not in exclude_lines:
            modified_code += line

    return modified_code.strip()

# Đọc nội dung từ file JS gốc
original_js_path = "JavaScript/template/template.js"
with open(original_js_path, "r") as file:
    original_js_code = file.readlines()

# Thực hiện sửa đổi
OnSubmit_code = get_OnSubmit_code(original_js_code)
OnSubmit_code = remove_line(OnSubmit_code, 'event.preventDefault();')
OnSubmit_code = remove_line(OnSubmit_code, '// Code start here')
new_js_code = modify_js_code(OnSubmit_code)

# Thêm dòng main cuối dòng file
main = "\nmain()"
new_js_code += main

# Ghi kết quả vào file mới
with open("JavaScript/template/program.js", "w") as file:
    file.write(new_js_code)