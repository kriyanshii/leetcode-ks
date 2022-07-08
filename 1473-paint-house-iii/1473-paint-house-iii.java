class Solution {
    int[] hs;
    int[][] cs;
    int m, n, t;
    Integer[][][] dp;
    
    public int minCost(int[] hs, int[][] cs, int m, int n, int target) {
        this.hs = hs;
        this.cs = cs;
        this.m = m;
        this.n = n;
        t = target;
        dp = new Integer[m + 1][t + 1][n + 2];
        for(int i = 0; i <= n; i++) dp[m][0][i] = 0;
        int res = dfs(0, t, n + 1);
        return res < Integer.MAX_VALUE ? res : -1;
    }
    private int dfs(int idx, int rem, int c){
        if(rem >= 0 && dp[idx][rem][c] != null){
            return dp[idx][rem][c];
        }
        int res = Integer.MAX_VALUE;
        if(idx >= m || rem < 0){
            return rem == 0 ? 0 : res;
        }
        if(hs[idx] > 0){
            int diff = (hs[idx] == c ? 0 : 1);
            dp[idx][rem][c] = dfs(idx + 1, rem - diff, hs[idx]);
            return dp[idx][rem][c];
        }
        for(int i = 1; i <= n; i++){
            int diff = (i == c ? 0 : 1);
            int last = dfs(idx + 1, rem - diff, i);
            if(last < Integer.MAX_VALUE){
                res = Math.min(res, i == 0 ? 0 : cs[idx][i - 1] + last);
            }
        }
        dp[idx][rem][c] = res;
        return res;
    }
}