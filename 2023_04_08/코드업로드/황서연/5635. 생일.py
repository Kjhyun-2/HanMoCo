import sys

n = int(sys.stdin.readline())
arr= []

for i in range(n):
    arr_raw = list(map(str,sys.stdin.readline().split()))
    arr.append(arr_raw)

for i in range(n):
    arr[i][1] = int(arr[i][1])
    arr[i][2] = int(arr[i][2])
    arr[i][3] = int(arr[i][3])

arr = sorted(arr,key=lambda x: (x[3],x[2],x[1]))

print(arr[n-1][0])
print(arr[0][0])


