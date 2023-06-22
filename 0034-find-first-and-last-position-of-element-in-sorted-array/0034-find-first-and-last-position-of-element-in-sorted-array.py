class Solution:
    def searchRange(self, arr, target):
        position = [-1, -1]
        position[0] = self.find(arr, target, True)
        if position[0] != -1:
            position[1] = self.find(arr, target, False)
        return position

    def find(self, nums, target, doLeft):
        start = 0
        end = len(nums) - 1
        index = -1
        while start <= end:
            mid = start + (end - start) // 2
            if nums[mid] < target:
                start = mid + 1
            elif nums[mid] > target:
                end = mid - 1
            else:
                index = mid
                if doLeft:
                    end = mid - 1
                else:
                    start = mid + 1
        return index