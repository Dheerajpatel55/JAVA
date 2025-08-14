import math
# n=int(input())
# for i in range(1, int(math.sqrt(n))):
#     if(n % i == 0):
#         print(i,(n//i), end=" ")

# def isPerfect(n):
#     sum = 0
#     for i in range(1, n):
#         if n % i == 0:
#             print(i)
#             sum += i
           
#     return sum == n
# n =int(input())
# print("true" if isPerfect(n) else "false")

# n=int(input())
# s=1
# for i in range(2, int(math.sqrt(n)+1)):
#     if(n%i==0):
#         s+=i
#         s+=(n//i)
# if(s==n):
#     print("YES")
# else:
#     print("NO")
def recur_sum(n):
    if n <= 1: # Base condition
        return n
    else:
        print(n)
        return n + recur_sum(n - 1) # Recursive call

# Driver code
n = 10
print(f"Sum = {recur_sum(n)}")