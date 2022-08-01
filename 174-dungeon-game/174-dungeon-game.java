class Solution {
    public int calculateMinimumHP(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        
        int m = grid.length;
        int n = grid[0].length;
        
        int[][] result = new int[m][n];
        
        result[m - 1][n - 1] = Math.max(1 - grid[m - 1][n - 1], 1);
        
        for(int i = m - 2; i >= 0; i--){
            result[i][n - 1] = Math.max(result[i + 1][n - 1] - grid[i][n - 1], 1);
        }
        
        for(int j = n - 2; j >= 0; j--){
            result[m - 1][j] = Math.max(result[m - 1][j + 1] - grid[m - 1][j], 1);
        }
        
        for(int i = m - 2; i >= 0; i--){
            for(int j = n - 2; j >= 0; j--){
                int down = Math.max(result[i + 1][j] - grid[i][j], 1);
                int right = Math.max(result[i][j + 1] - grid[i][j], 1);
                result[i][j] = Math.min(down, right);
            }
        }
        return result[0][0];
    }
}