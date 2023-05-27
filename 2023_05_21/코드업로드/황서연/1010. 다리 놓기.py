import sys
from itertools import combinations

case = int(sys.stdin.readline())
dap = 0

def fac(m):
    if m ==0 or m ==1:
        return 1
    else :
        return int(fac(m-1) * m)

for i in range(case):
    N,M = map(int,sys.stdin.readline().split())
    if N == M :
        dap = 1
    else :
        dap = int(fac(M)//(fac(M-N)*fac(N)))
    print(dap)



