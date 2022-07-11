class Solution {
    public int maxProfit(int[] prices) {
        int minVal = Integer.MAX_VALUE;
        int maxProf = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minVal){
                minVal = prices[i];
            }else{
                maxProf = Math.max(maxProf, prices[i] - minVal);
            }
        }
        return maxProf;
    }
}