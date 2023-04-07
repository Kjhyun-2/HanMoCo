import sys
import math

n = int(sys.stdin.readline())
D = 77
arr = []
dap = []
dapa = 0

for i in range(n):
    a = list(map(int,sys.stdin.readline().split()))
    arr.append(a)
    dapa = math.sqrt(math.pow(a[0],2)+math.pow(a[1],2))/D
    dap.append(dapa)

for idx in dap:
    big = dap.index(max(dap))
    dap[big] = -1
    print(big+1)