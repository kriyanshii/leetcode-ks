class Solution {
    public int minimumCost(int[] nums) {
        int sum = 0, n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i % 3 != n % 3){
                sum += nums[i];
            }
        }
        return sum;
    }
}