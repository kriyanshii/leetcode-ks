class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0, k = 1, res = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] == 0){
                k--;
            }
            while(k < 0){
                if(nums[i] == 0){
                    k++;
                }
                i++;
            }
            // no +1 cause we are deleting one 1.
            res = Math.max(res, j - i);
        }
        return res;
    }
}