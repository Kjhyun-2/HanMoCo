arr=[]
arr = list(input())

re_arr = list(reversed(arr))

if (str(re_arr) == str(arr)):
    print("1")
else :
    print("0")