import sys

arr = []
for i in range(7):
    n = int(sys.stdin.readline())
    if n%2 != 0:
        arr.append(n)

if len(arr) == 0:
    print(-1)
else:
    print(sum(arr))
    print(min(arr))

