class Solution {
    public int maxFrequency(int[] nums, int k) {
        // here sliding window 
        // sorting so nums[i] will be max for 0 - i
        // here if
        // sum + nums[i] >= max * size of array then
        // size of the array will be the max size.
        int res = 1, i = 0;
        long sum = 0;
        Arrays.sort(nums);
        for(int j = 0; j < nums.length; j++){
            sum += nums[j];
            while(sum + k < (long)nums[j] * (j - i + 1)){
                sum -= nums[i++];
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}