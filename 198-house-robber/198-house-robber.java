class Solution {
    public int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;
        for(int n: nums){
            int tmp = prev1;
            prev1 = Math.max(prev1, prev2 + n);
            prev2 = tmp;
        }
        return prev1;
    }
}