import sys
import re

file_name = sys.argv[1]
regex = r"u45(\w)(\w)"

with open(file_name, 'r') as myfile:
    data=myfile.read()

def subst(match):
     return match.group(1).upper() + match.group(2)

# You can manually specify the number of replacements by changing the 4th argument
result = re.sub(regex, subst, data, 0)

if result:
    print (result)
