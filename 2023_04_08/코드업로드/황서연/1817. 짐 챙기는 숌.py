import sys

#책 수, max 무게

N,M = map(int,sys.stdin.readline().split())

#박스
cnt = 1
box = []

if N == 0:
    print('0')
else :
    arr = [0] + list(map(int, sys.stdin.readline().split()))
    for i in range(1,len(arr),1):
        box.append(arr[i-1])
        if(sum(box)+arr[i] <= M):
            continue
        else:
            box = []
            cnt = cnt + 1
    print(cnt)
