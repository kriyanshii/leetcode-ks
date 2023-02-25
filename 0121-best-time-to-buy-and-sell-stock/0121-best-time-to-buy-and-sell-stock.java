class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar = Integer.MAX_VALUE, maxProf = Integer.MIN_VALUE;
        for(int i = 0; i < prices.length; i++){
            minSoFar = Math.min(minSoFar, prices[i]);
            maxProf = Math.max(prices[i] - minSoFar, maxProf);
        }
        return maxProf;
    }
}