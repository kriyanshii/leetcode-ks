class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if(k == 0 || n >= k + maxPts) return 1;
        double dp[] = new double[n + 1], wsum = 1, res = 0;
        dp[0] = 1;
        for(int i = 1; i <= n; i++){
            dp[i] = wsum / maxPts;
            if(i < k) wsum += dp[i];
            else{
                res += dp[i];
            }
            if(i - maxPts >= 0) wsum -= dp[i - maxPts];
        }
        return res;
    }
    
}