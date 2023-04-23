import sys

n = int(sys.stdin.readline())

def alpha(x,y):
    cnt = 2
    k=0
    k = y-x -2
    i = 2
    while True :
        if k <= 0:
            return cnt
        k = k - i
        i = i + 1
        cnt = cnt + 1

for i in range(n):
    x,y = map(int,sys.stdin.readline().split())
    result = alpha(x,y)
    print(result)