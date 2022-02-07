class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = -1;
        int[] max = new int[2];
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max[1]){
                max[0] = max[1];
                max[1] = nums[i];
                maxIndex = i;
            }else if(nums[i] > max[0]){
                max[0] = nums[i];
            }
        }
        return max[0] * 2 <= max[1] ? maxIndex : -1;
    }
}