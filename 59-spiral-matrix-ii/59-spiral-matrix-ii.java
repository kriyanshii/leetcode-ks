class Solution {
    public int[][] generateMatrix(int n) {
        int cnt = 1;
        int[][] result = new int[n][n];
        for(int layer = 0; layer < (n + 1)/2; layer++){
            //traverse from left to right
            for(int ptr = layer; ptr<n - layer; ptr++){
                result[layer][ptr] = cnt++;
            }
            //traverse from top to bottom
            for(int ptr = layer + 1; ptr < n - layer; ptr++){
                result[ptr][n - layer - 1] = cnt++;
            }
            //traverse from left to right;
            for(int ptr = layer + 1; ptr < n - layer; ptr++){
                result[n - layer - 1][n - ptr - 1] = cnt++;
            }
            //traverse from left to right;
            for(int ptr = layer + 1; ptr < n - layer - 1; ptr++){
                result[n - ptr - 1][layer] = cnt++;
            }            
        }
        return result;
    }
}