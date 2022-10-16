class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length, maxd;
        if(n < d) return -1;
        int[] dp = new int[n+1];
        for(int i = n - 1; i >= 0; i--){
            dp[i] = Math.max(dp[i+1], jobDifficulty[i]);
        }
        for(int k = 2; k <= d; ++k){
            for(int i = 0; i <= n - k; i++){
                maxd = 0;
                dp[i] = Integer.MAX_VALUE;
                for(int j = i; j <= n - k; j++){
                    maxd = Math.max(maxd, jobDifficulty[j]);
                    dp[i] = Math.min(dp[i], maxd + dp[j + 1]);
                }
            }
        }
        return dp[0];
    }
}