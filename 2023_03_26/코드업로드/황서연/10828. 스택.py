import sys
arr = []


N = int(sys.stdin.readline())
for i in range(N):
    m = sys.stdin.readline().split()
    if (m[0] == 'push'):
        arr.append(int(m[1]))
    elif (m[0]== 'pop'):
        print(arr.pop() if arr else -1)
    elif (m[0]== 'size'):
        print(len(arr))
    elif (m[0]=='empty'):
        print(0 if arr else 1)
    else :
        print(arr[-1] if arr else -1)

