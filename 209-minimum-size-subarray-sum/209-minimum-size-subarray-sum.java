class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, n = nums.length, res = n + 1;
        for(int j = 0; j < n; j++){
            target -= nums[j];
            while(target <= 0){
                res = Math.min(res, j - i + 1);
                target += nums[i++];
            }
        }
        return res % (n + 1);
    }
}