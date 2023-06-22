class Solution {
    public int maxProfit(int[] prices, int fee) {
        if(prices.length <= 0) return 0;
        int len = prices.length;
        int[] buy = new int[len], sell = new int[len];
        buy[0] = -prices[0];
        for(int i = 1; i < len; i++){
            buy[i] = Math.max(buy[i - 1], sell[i - 1] - prices[i]);
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i] - fee);
        }
        return sell[len - 1];
    }
} 