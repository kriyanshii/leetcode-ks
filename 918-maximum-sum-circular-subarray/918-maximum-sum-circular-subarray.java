class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0, minSum = nums[0], curMin = 0, maxSum = nums[0], curMax = 0;
        for(int n: nums){
            curMax = Math.max(curMax + n, n);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + n, n);
            minSum = Math.min(curMin, minSum);
            total += n;
        }
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }
}