class Solution:
    def twoSum(self, nums, target):
        previous = {}
        
        for i in range(len(nums)):
            needed = target - nums[i]
            
            if needed in previous:
                return [previous[needed], i]
            
            previous[nums[i]] = i