import sys

#동전 배열
arr = []
cnt = 0

n,k = map(int,sys.stdin.readline().split())

for i in range(n):
    a = int(sys.stdin.readline())
    arr.append(a)

while True:
    if (k < max(arr)):
        arr[arr.index(max(arr))] = 0
    else :
        cnt = cnt + k//max(arr)
        k = k % max(arr)
    if (k == 0):
        print(cnt)
        break