class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int end = -1;
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            if(max > nums[i]){
                end = i;
            }else{
                max = nums[i];
            }
        }
        int start = 0;
        int min = nums[nums.length - 1];
        for(int j=nums.length -2;j>=0; j--){
            if(min < nums[j]){
                start = j;
            }else{
                min = nums[j];
            }
        }
        return end - start + 1;
    }
}