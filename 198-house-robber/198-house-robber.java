class Solution {
    public int rob(int[] nums) {
        int now = 0;
        int last = 0;
        int tmp;
        for(int n : nums){
            tmp = now;
            now = Math.max(last + n, now);
            last = tmp;
        }
        return now;
    }
}