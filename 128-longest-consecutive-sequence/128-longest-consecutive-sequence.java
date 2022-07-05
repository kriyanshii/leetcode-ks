class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
    
        if(nums.length <= 1) return nums.length;
        
        int res = 0; //2
        int count = 1; //
        for (int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1] + 1) {
                count++;
            } else if ((nums[i] != nums[i-1] + 1) && nums[i] != nums[i-1]){
                count = 1;
            }
            res = Integer.max(res, count);
        }
        return res;
    }
}