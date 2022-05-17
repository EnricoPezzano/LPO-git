import os

def test(dir_name):
    ntc = False
    if 'ntc' in dir_name:
        ntc = True
    for f in os.listdir(dir_name):
        if f != 'ntc':
            print(f"===| Running {dir_name}/{f} {'with ntc' if ntc else ''} |===")
            os.system(f"java lpp.Main {'-ntc' if ntc else ''} -i {dir_name}/{f}")

dirs = ("failure/ntc", "failure/syntax", "failure/type", "success", "success/ntc") 

for dir in dirs:
    test(f"tests/{dir}")

print("===| Ended Tests |===")