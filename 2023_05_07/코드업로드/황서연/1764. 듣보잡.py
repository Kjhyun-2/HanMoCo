import sys

n,m = map(int,sys.stdin.readline().split())
nrr = []
mrr = []


for i in range(n):
    nrr.append(input())
for i in range(m):
    mrr.append(input())

nrr1 = set(nrr)
mrr1 = set(mrr)

dap = nrr1.intersection(mrr1)

print(len(dap))
dap1 = list(dap)

dap1.sort()
for i in range(len(dap1)):
    print(dap1[i])

