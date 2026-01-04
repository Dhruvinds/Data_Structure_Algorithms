import sys

sys.stdin = open('input.txt', 'r')
sys.stdout = open('output.txt', 'w')

nums = [3,1,2,4,1,5,2,6,4]

def merge_sort(nums):
    if (len(nums)<= 1):
        return nums
    
    mid = len(nums)//2
    left_arr = nums[:mid]
    right_arr = nums[mid:]

    left = merge_sort(left_arr)
    right = merge_sort(right_arr)
    return merge_array(left, right)

def merge_array(left, right):
    arr = []
    i, j = 0, 0
    n, m = len(left), len(right)

    while i < n and j < m :
        if left[i] <= right[j]:
            arr.append(left[i])
            i += 1
        else:
            arr.append(right[j])
            j += 1

    if i < n:
        while (i<n):
            arr.append(left[i])
            i += 1

    if j < m:
        while j < m :
            arr.append(right[j])
            j += 1

    return arr

print(merge_sort(nums))
