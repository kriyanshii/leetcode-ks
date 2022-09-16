class Solution {
    int n, m;
    int[] nums, mult;
    Integer[][] memo;
    public int maximumScore(int[] nums, int[] multipliers) {
        this.n = nums.length;
        this.m = multipliers.length;
        this.nums = nums;
        this.mult = multipliers;
        this.memo = new Integer[m][m];
        return dp(0, 0);
    }
    
    public int dp(int l, int i){
        if(i == m) return 0;
        if(memo[l][i] != null) return memo[l][i];
        int left = dp(l + 1, i + 1) + nums[l] * mult[i];
        // System.out.println(left + " " + l + " " + i);
        int right = dp(l, i + 1) + nums[n - (i - l) - 1] * mult[i];
        // System.out.println(right + " " + l + " " + i);
        return memo[l][i] = Math.max(left, right);
    }
}