class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long res = 0;
        int minI = 0, maxI = 0, c = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == minK) minI = i;
            if(nums[i] == maxK) maxI = i;
            if(nums[i] < minK || nums[i] > maxK){
                c = i + 1;
                minI = i;
                maxI = i;
            }
            if(nums[minI] == minK && nums[maxI] == maxK){
                res += Math.min(minI - c, maxI - c) + 1;
            }
        }
        return res;
    }
}