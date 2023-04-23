
import sys

#처음 막대기
X = 64
# 갖고 싶은 막대기
acc = int(sys.stdin.readline())
cnt = 0

while True:
    #갖고 있는 막대기가 원하는 막대기 보다 크면 -> 갖고 있던 막대기 절반으로 자름
    if(X>acc):
        X = X//2
    else :
        #갖고 있는 막대기가 원하는 막대기 보다 작을 경우 -> 절반은 내꺼다
        #원하는 길이가 0이 될때까지 빼면 내가 갖고 있는 막대기 합이 acc
        acc = acc -X
        cnt = cnt + 1
        if (acc==0):
            break

print(cnt)