class Solution {
    public int minimumLines(int[][] stockPrices) {
        Arrays.sort(stockPrices, (a, b) -> a[0] - b[0]);
        
        int result = Math.min(stockPrices.length - 1, 1);
        long n1, n2, d1, d2;
        
        for (int i = 2; i < stockPrices.length; ++i ){
            n1 = stockPrices[i][1] - stockPrices[i - 1][1];
            d1 = stockPrices[i][0] - stockPrices[i - 1][0];
            
            n2 = stockPrices[i - 1][1] - stockPrices[i - 2][1];
            d2 = stockPrices[i - 1][0] - stockPrices[i - 2][0];
            
            if (n1*d2 != n2*d1)
                ++result;
        }
        
        return result;
    }
}