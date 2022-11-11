class Solution {
    public int maximumTop(int[] nums, int k) {
        if(nums.length == 1 && k % 2 == 1){
            return -1;
        }
        int max = 0;
        for(int i = 0; i < Math.min(k - 1, nums.length); i++){
            max = Math.max(nums[i], max);
        }
        
        if(k < nums.length){
            max = Math.max(nums[k], max);
        }
        return max;
    }
}