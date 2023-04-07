import sys

n,m = map(int,sys.stdin.readline().split())

arr = [[0 for j in range(m+1)] for i in range(n+1)]
arr[0][0] = 1

for i in range(1,n+1,1):
    for j in range(1,m+1,1):
        arr[i][j] = (arr[i-1][j] + arr[i][j-1] + arr[i-1][j-1]) %1000000007

print(arr[n][m])