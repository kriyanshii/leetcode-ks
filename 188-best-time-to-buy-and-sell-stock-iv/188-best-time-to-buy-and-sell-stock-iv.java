class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int prof = 0;
        if(k >= n){
            for(int i = 1; i < prices.length; i++){
                if(prices[i - 1] < prices[i]){
                    prof += prices[i] - prices[i - 1];
                }
            }
            return prof;
        }
        
        int[][] dp = new int[k + 1][n];
        for(int i = 1; i <= k; i++){
            int localMax = dp[i-1][0] - prices[0];
            // System.out.println(localMax);
            for(int j = 1; j < n; j++){
                // System.out.println(dp[i][j - 1]);                
                dp[i][j] = Math.max(dp[i][j - 1], prices[j] + localMax);
                // System.out.println(i + " " +dp[i][j]);
                localMax = Math.max(dp[i - 1][j] - prices[j], localMax);
                // System.out.println(localMax);
            }
        }
        return dp[k][n-1];
    }   
}