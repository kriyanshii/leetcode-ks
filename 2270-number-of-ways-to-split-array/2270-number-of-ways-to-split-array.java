class Solution {
    public int waysToSplitArray(int[] nums) {
        int count = 0;
        long backSum = 0;
        long frontSum = 0;
        for (int n : nums) backSum += n;
        for (int i = 0; i < nums.length - 1; i++) {
            frontSum += (long)nums[i];
            backSum -= (long)nums[i];
            if (frontSum >= backSum) {
                count++;
            }
        }
        return count;
    }   
    
}