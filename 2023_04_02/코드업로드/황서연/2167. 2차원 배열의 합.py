import sys

n , k = map(int,sys.stdin.readline().split())
brr = [[0 for j in range(k+1)] for i in range(n+1)]
brr1 = [[0 for j in range(k+1)] for i in range(n+1)]
for i in range(1,n+1,1):
    brr[i] = [0] + list(map(int,sys.stdin.readline().split()))

for i in range(1,n+1):
  for j in range(1,k+1):
    brr1[i][j] = brr1[i][j-1] + brr1[i-1][j] - brr1[i-1][j-1] + brr[i][j]

kk = int(sys.stdin.readline())
for i in range(kk):
  a,b,c,d = map(int, sys.stdin.readline().split())
  result = brr1[c][d] - brr1[a-1][d] - brr1[c][b-1] + brr1[a-1][b-1]
  print(result)

