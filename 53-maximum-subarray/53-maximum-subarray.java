class Solution {
    public int maxSubArray(int[] nums) {
        int maxEnd = 0, maxSoFar = Integer.MIN_VALUE;
        for(int n: nums){
            maxEnd += n;
            if(maxSoFar < maxEnd){
                maxSoFar = maxEnd;
            }if(maxEnd < 0){
                maxEnd = 0;
            }
        }
        return maxSoFar;
    }
}