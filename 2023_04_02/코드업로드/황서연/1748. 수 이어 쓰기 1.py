import sys


cnt = 0
N = int(sys.stdin.readline())

k=1
for i in range(1,len(str(N)),1):
    cnt = cnt + (i*(9*k))
    k = k * 10

#print(cnt)
m = N - (10**(len(str(N))-1)) + 1
#print(m)
knt = m*len(str(N)) + cnt
print(knt)

