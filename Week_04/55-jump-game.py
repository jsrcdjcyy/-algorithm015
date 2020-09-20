class Solution:
    def canJump(self, nums: List[int]) -> bool:
        canReachLocation = len(nums) - 1
        for i in range(len(nums) - 1, -1, -1):
            if nums[i] + i >= canReachLocation:
                canReachLocation = i
        return canReachLocation == 0