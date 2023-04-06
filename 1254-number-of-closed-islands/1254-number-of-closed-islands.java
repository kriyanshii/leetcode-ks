class Solution {
    public int fill(int[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 0){
            return 0;
        }
        return (grid[i][j] = 1) + fill(grid, i + 1, j) + fill(grid, i, j + 1) + fill(grid, i, j - 1) + fill(grid, i - 1, j);
    }
    
    public int closedIsland(int[][] grid) {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(i * j * (i - grid.length + 1) * (j - grid[0].length + 1) == 0){
                    fill(grid, i, j);
                }
            }
        }
        int res = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                res += fill(grid, i, j) > 0 ? 1 : 0;
            }
        }
        return res;
    }
}