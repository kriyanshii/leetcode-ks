class Solution {
    public int minimumLines(int[][] stockPrices) {
        int n = stockPrices.length;
        if(n == 1) return 0;
        Arrays.sort(stockPrices, (a,b)-> Integer.compare(a[0], b[0]));
        int count = 1;
        for(int i=2; i<n; i++){
            // check (y2 - y1) / (x2 - x1) == (y1 - y0) / (x1 - x0)
            if((stockPrices[i][1] - stockPrices[i-1][1]) *(stockPrices[i-1][0] - stockPrices[i-2][0]) == (stockPrices[i-1][1] - stockPrices[i-2][1]) * (stockPrices[i][0] - stockPrices[i-1][0])) continue;
            count++;
        }
        return count;
    }
}