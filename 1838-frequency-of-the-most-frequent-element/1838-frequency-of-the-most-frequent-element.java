class Solution {
    public int maxFrequency(int[] nums, int k) {
        // here sliding window 
        // sorting so nums[i] will be max for 0 - i
        // here if
        // sum + nums[i] >= max * size of array then
        // size of the array will be the max size.
        int res = 1, j = 0;
        long sum = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            while(sum + k < (long) nums[i] *(i - j + 1)){
                sum -= nums[j++];
            }
            res = Math.max(res, i - j + 1);
        }
        return res;
    }
}