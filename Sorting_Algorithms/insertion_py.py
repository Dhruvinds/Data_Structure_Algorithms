import sys

sys.stdin = open('input.txt', 'r')
sys.stdout = open('output.txt', 'w')

nums = [5,4,3,2,1,0]

for i in range (1, len(nums)):
    key = nums[i]
    j = i - 1

    while ( j >= 0 and nums[j] > key ) :
        nums[j+1] = nums[j]
        j -= 1
    nums[j+1] = key

print(nums)
