import sys

N = int(sys.stdin.readline().rstrip())
str_num = '666'
i = 665
cnt = 0

while True:
    i = i + 1
    if (str(i).count('666') >= 1):
        cnt = cnt + 1
    if (cnt == N):
        print(i)
        break
