import sys

n = int(sys.stdin.readline())

for i in range(n):
    cnt = 0
    stack= []
    arr = []

    arr = list(map(str,sys.stdin.readline().replace('\n','')))
    for j in range(0,len(arr),1):
        if(arr[j] == ')'):
            if (len(stack) != 0):
                stack.pop()
            else :
                print("NO")
                cnt = cnt + 1
                break
        else :
            stack.append(arr[j])


    if (cnt == 0):
        if (len(stack) == 0):
            print("YES")
        else:
            print("NO")

