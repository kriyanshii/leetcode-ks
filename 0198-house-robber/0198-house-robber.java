class Solution {
    public int rob(int[] nums) {
        int prev1 = 0, prev2 = 0;
        for(int i: nums){
            int tmp = prev1;
            prev1 = Math.max(prev1, prev2 + i);
            prev2 = tmp;
        }
        return prev1;
    }
}