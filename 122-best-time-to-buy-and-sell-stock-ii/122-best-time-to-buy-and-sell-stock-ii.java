class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2){
            return 0;
        }
        int totalProf = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i - 1] < prices[i]){
                totalProf += prices[i] - prices[i - 1];
            }
        }
        return totalProf;
    }
}