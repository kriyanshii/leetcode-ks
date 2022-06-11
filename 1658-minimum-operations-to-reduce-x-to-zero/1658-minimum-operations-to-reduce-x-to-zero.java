class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int n : nums) sum += n;
        int currSum = 0, maxLen = -1;
        for(int l=0, r = 0; r < nums.length; r++){
            currSum += nums[r];
            while(l <= r && currSum > sum - x){
                currSum -= nums[l++];
            }
            if(currSum == sum - x){
                maxLen = Math.max(maxLen, r-l+1);
            }
        }
        return maxLen == -1 ? -1 : nums.length - maxLen;
    }
}