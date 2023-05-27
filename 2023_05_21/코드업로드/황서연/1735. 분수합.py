import sys

a,a_1 = map(int,sys.stdin.readline().split())
b,b_1 = map(int,sys.stdin.readline().split())

A = (a*b_1) + (a_1*b)
B = a_1 * b_1

def gcd(a,b):
    if b == 0:
        return a
    else :
        return gcd(b,a%b)

gcd = gcd(A,B)
if gcd == 1:
    print(A,B)
else :
    print(A//gcd,B//gcd)