class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, res = nums.length + 1;
        for(int j = 0; j < nums.length; j++){
            target -= nums[j];
            while(target <= 0){
                res = Math.min(res, j - i + 1);
                target += nums[i++];
            }
        }
        // to check it is subarray, not the full array
        return res % (nums.length + 1);
    }
}