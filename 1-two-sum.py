class Solution:
    def twoSum(self, nums, target):
        previous = {}
        
        for index, current_num in enumerate(nums):
            needed_num = target - current_num
            
            if needed_num in previous:
                return [previous[needed_num], index]
            
            previous[current_num] = index