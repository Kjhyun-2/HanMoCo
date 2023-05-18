import sys

word = ['a','e','i','o','u']
arr = list(map(str,sys.stdin.readline().replace('\n',' ')))
cnt = 0

for i in range(len(word)):
    k = arr.count(word[i])
    cnt = cnt + k

print(cnt)