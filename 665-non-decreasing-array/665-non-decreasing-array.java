class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        int index = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] > nums[i]){
                index = i;
                count++;
            }
        }
        if(count == 0) return true;
        if(count == 1){
            //check if the deviation is at the end or start
            if(index == 1 || index == nums.length - 1){
                return true;
            }
            if(nums[index - 1] <= nums[index + 1] || nums[index - 2] <= nums[index]){
                // if it is in middle
                return true;
            }
            return false;
        }
        return false;
    }
}