import os

repo_url = "https://github.com/strygwyr69/Leetcode-java-solutions"

f = open("README.md", "w")
f.write("# LeetCode Java Solutions\n\n")

java_files = [s for s in os.listdir() if s.endswith('.java')]
for file in java_files:
    f.write("- [" + file + "](" + repo_url + "/blob/main/" + file + ")\n")

f.write('''
## Generate this README

```bash
python generate_readme.py
```
''')