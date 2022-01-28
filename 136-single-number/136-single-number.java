class Solution {
    public int singleNumber(int[] nums) {
        int mask = 0;
        for(int i=0; i<nums.length;i++){
            mask ^= nums[i];
        }
        return mask;
    }
}