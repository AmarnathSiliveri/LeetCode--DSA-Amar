class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        unique_nums = list(set(nums))
        unique_nums.sort()
        nums[:] = unique_nums
        
        
        return len(unique_nums)
        