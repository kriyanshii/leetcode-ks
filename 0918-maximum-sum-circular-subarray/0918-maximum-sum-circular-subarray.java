class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int minSum = nums[0], maxSum = nums[0], curMin = 0, curMax = 0, total = 0;
        for(int i: nums){
            total += i;
            curMin = Math.min(curMin + i, i);
            curMax = Math.max(curMax + i, i);
            minSum = Math.min(minSum, curMin);
            maxSum = Math.max(maxSum, curMax);
        }
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }
}