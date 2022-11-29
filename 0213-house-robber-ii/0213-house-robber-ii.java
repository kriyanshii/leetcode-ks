class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        return Math.max(robHouse(nums, 0, nums.length - 1), robHouse(nums, 1, nums.length));
    }
    public int robHouse(int[] nums, int start, int end){
        int prev1 = 0, prev2 = 0;
        for(int i = start; i < end; i++){
            int tmp = prev1;
            prev1 = Math.max(prev1, prev2 + nums[i]);
            prev2 = tmp;
        }
        return prev1;
    }
}