import sys

n = int(sys.stdin.readline())
nrr = list(map(int,sys.stdin.readline().split()))
m = int(sys.stdin.readline())
mrr = list(map(int,sys.stdin.readline().split()))

dic ={}

for i in mrr:
    dic[i] = 0

#print(dic)

for j in nrr:
    if j in dic:
        dic[j] = 1

for i in dic:
    print(dic[i],end= " ")
