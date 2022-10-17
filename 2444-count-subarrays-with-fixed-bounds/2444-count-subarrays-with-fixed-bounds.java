class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long res = 0, jbad = -1, jmin = -1, jmax = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < minK || nums[i] > maxK){
                jbad = i;
            }if(nums[i] == minK){
                jmin = i;
            }if(nums[i] == maxK){
                jmax = i;
            }
            res += Math.max(0L, Math.min(jmax, jmin) - jbad);
        }
        return res;
    }
}