import sys

S = str(input())
arr = []

for i in range(len(S)):
    for j in range(i,len(S)):
        arr.append(S[i:j+1])

print(arr)
print(len(set(arr)))

