class Solution {
    public int maxSubArray(int[] nums) {
        int maxNow = 0, maxSoFar = Integer.MIN_VALUE;
        for(int i: nums){
            maxNow += i;
            maxSoFar = Math.max(maxSoFar, maxNow);
            //if maxNow gets < 0;
            maxNow = Math.max(maxNow, 0);
        }
        return maxSoFar;
    }
}