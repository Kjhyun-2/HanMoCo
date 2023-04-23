import sys

n = int(sys.stdin.readline())
arr = []
dap = []

for i in range(n):
    aa = list(map(int,sys.stdin.readline().split()))
    arr.append(aa)

for i in range(0,n,1):
    cnt = 1
    kk = arr[i]
    for j in range(n):
        if (kk[0] < arr[j][0] and kk[1] < arr[j][1]):
            cnt = cnt + 1
        else :
            continue
    dap.append(cnt)

for i in range(len(dap)):
    print(dap[i],end=" ")