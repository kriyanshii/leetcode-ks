class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length - 1; i > 1; i--){
            if(nums[i] < nums[i - 2] + nums[i - 1]){
                return nums[i] + nums[i - 2] + nums[i - 1];
            }
        }
        return 0;
    }
}