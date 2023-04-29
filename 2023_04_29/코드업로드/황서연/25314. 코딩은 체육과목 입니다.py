import sys

n = int(sys.stdin.readline())

if (n % 4 == 0):
    print('long '*(n//4)+'int')
else :
    print('long '*(n//4+1)+'int')