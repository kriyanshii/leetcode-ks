class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int prev = 0, slice = 0;
        for(int i = 2; i < nums.length; i++){
            if(nums[i - 2] - nums[i - 1] == nums[i - 1] - nums[i]){
                prev += 1;
                slice += prev;
            }else{
                prev = 0;
            }
        }
        return slice;
    }
}