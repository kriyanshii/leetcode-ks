class Solution {
    public void sortColors(int[] nums) {
        int[] count = {0, 0, 0};
        for(int i: nums){
            if(i == 0) count[0]++;
            else if(i == 1) count[1]++;
            else count[2]++;
        }
        for(int i=0; i<nums.length; i++){
            if(i < count[0]) nums[i] = 0;
            else if(i < count[0] + count[1]) nums[i] = 1;
            else nums[i] = 2;
        }
    }
}