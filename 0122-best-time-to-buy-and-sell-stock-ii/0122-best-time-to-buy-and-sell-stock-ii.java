class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0) return 0;
        int lastBuy = -prices[0], lastSell = 0;
        for(int i = 1; i < prices.length; i++){
            int curBuy = Math.max(lastBuy, lastSell - prices[i]);
            int curSell = Math.max(lastSell, lastBuy +  prices[i]);
            lastBuy = curBuy;
            lastSell = curSell;
        }
        return lastSell;
    }
}