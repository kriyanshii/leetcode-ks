class Solution {
    public int minimumDeletions(int[] nums) {
        int minI = 0, maxI = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] < nums[minI]){
                minI = i;
            }
            if(nums[i] > nums[maxI]){
                maxI = i;
            }
        }
        
        int firstDiff = Math.max(maxI, minI) + 1;
        int lastDiff = n - Math.min(maxI, minI);
        int midDiff = n - Math.max(maxI, minI) + Math.min(maxI, minI) + 1;
        return Math.min(Math.min(firstDiff, lastDiff), midDiff);
    }
}