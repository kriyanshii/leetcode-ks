class Solution {
    public int maxSubArray(int[] nums) {
        int maxNow = 0, maxSoFar = Integer.MIN_VALUE;
        for(int i: nums){
            maxNow += i;
            maxSoFar = Math.max(maxNow, maxSoFar);
            maxNow = maxNow < 0 ? 0: maxNow;
        }
        return maxSoFar;
    }
}