class Solution {
    public int minMaxGame(int[] nums) {
        int min = Integer.MIN_VALUE;
        while(nums.length > 1){
            int n = nums.length;
            int[] newNums = new int[n/2];
            for(int i = 0; i < newNums.length; i++){
                newNums[i] = (i % 2 == 0) ? Math.min(nums[2 * i], nums[2 * i + 1]) : Math.max(nums[2 * i], nums[2 * i + 1]);
            }
            nums = newNums;
        }
        return nums[0];
    }
}