import sys

#문자열 입력
S = list(sys.stdin.readline().replace('\n',''))
arr = []
dap = []

l= 0
for i in range(len(S)):
    arr = []
    for j in range(l,len(S),1):
        arr.append(S[j])
    l = l + 1
    dap.append(arr)

dap.sort()
for i in range(len(S)):
    for j in range(len(dap[i])):
        print(dap[i][j],end='')
    print()



