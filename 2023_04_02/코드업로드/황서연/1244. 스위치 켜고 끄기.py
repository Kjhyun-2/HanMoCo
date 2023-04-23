import sys

n = int(sys.stdin.readline())
arr = list(map(int,sys.stdin.readline().split()))
arr = [0] + arr
kk = []
A = 0

k = int(sys.stdin.readline())
for i in range(k):
    k_1 = list(map(int,sys.stdin.readline().split()))
    kk.append(k_1)


for i in range(k):
    if(kk[i][0] == 1):
        for j in range(1, n+1, 1):
            if (j % kk[i][1] == 0):
                if (arr[j] == 1):
                    arr[j] = arr[j] - 1
                else:
                    arr[j] = arr[j] + 1
    else :
        if (kk[i][1] == 1):
            if (arr[1] == 0):
                arr[1] = arr[1] + 1
            else:
                arr[1] = arr[1] - 1
        elif (kk[i][1] == len(arr)-1) :
            if (arr[len(arr)-1] == 0):
                arr[len(arr)-1] = arr[len(arr)-1] + 1
            else:
                arr[len(arr)-1] = arr[len(arr)-1] - 1
        else :
            if (kk[i][1] - 1 < n - kk[i][1]):
                A = kk[i][1] - 1
            else:
                A = n - kk[i][1]

            if (arr[kk[i][1]] == 0):
                arr[kk[i][1]] = arr[kk[i][1]] + 1
            else:
                arr[kk[i][1]] = arr[kk[i][1]] - 1

            for l in range(1, A + 1, 1):
                if (arr[kk[i][1] - l] == arr[kk[i][1] + l]):
                    if (arr[kk[i][1] - l] == 1):
                        arr[kk[i][1] - l] = arr[kk[i][1] - l] - 1
                        arr[kk[i][1] + l] = arr[kk[i][1] + l] - 1
                    else:
                        arr[kk[i][1] - l] = arr[kk[i][1] - l] + 1
                        arr[kk[i][1] + l] = arr[kk[i][1] + l] + 1
                else :
                    break


cnt = 0
for i in range(1,len(arr),1):
    print(arr[i],end=' ')
    cnt = cnt + 1
    if(cnt%20 == 0):
        print()
