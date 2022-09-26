class Solution {
    public int longestNiceSubarray(int[] nums) {
        int and = 0, res = 0, j = 0;
        for(int i = 0; i < nums.length; i++){
            while((and & nums[i]) != 0){
                // removing nums[j] from and
                and ^= nums[j++];
            }
            and |= nums[i];
            res = Math.max(res, i - j + 1);
        }
        return res;
    }
}