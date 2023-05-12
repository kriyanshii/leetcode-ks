class Solution {
    long[] dp;
    public long mostPoints(int[][] q) {
        dp = new long[q.length];
        return dfs(q, 0);
    }
    
    public long dfs(int[][] q, int n){
        //base case
        if(n >= q.length) return 0;
        if(dp[n] > 0) return dp[n];
        int points = q[n][0], jump = q[n][1];
        return dp[n] = Math.max(dfs(q, n + 1), points + dfs(q, n + jump + 1));
    }
}