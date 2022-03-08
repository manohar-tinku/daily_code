
def check_sum_equal_to_k(a,k):
    a = [int(i) for i in a] #make sure every item in list is int
    a.sort()
    i=0
    j=len(a)-1

    c=0
    while(i<j):
        s=a[i]+a[j]
        if s==k:
            c=1
            return True
        elif s>k:
            j=j-1
        else:
            i=i+1
    return False

a=input().split(' ')#[10,15,3,7] try to enter values as 10 15 3 7
k=int(input())#17
print(check_sum_equal_to_k(a,k))

    