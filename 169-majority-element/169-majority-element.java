class Solution {
    public int majorityElement(int[] nums) {
        // I am loosing my mind :/
        int candidate = -1, count = 0;
        for(int i=0; i<nums.length; i++){
            if(count == 0){
                candidate = nums[i];
                count = 1;
            }else{
                if(nums[i] == candidate){
                    count++;
                }
                else{
                    count--;
                }
            }
        }
        count = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] == candidate){
                count++;
            }
        }
        if(count > (nums.length/2)){
            return candidate;
        }
        return -1;
    }
}