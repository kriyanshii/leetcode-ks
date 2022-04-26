class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length - 1;
        int i = 0;
        Arrays.sort(nums);
        while(i <= n){
            if(nums[i] != i){
                return i;
            }
            i++;
        }
        return n+1;
    }
}