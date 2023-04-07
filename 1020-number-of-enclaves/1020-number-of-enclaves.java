class Solution {
    public int fill(int[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1){
            return 0;
        }
        return (grid[i][j] = 0) + fill(grid, i + 1, j) + fill(grid, i, j + 1) + fill(grid, i - 1, j) + fill(grid, i, j - 1);
    }
    
    public int numEnclaves(int[][] grid) {
        int res = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(i * j * (i - grid.length + 1)* (j - grid[0].length + 1) == 0){
                    fill(grid, i, j);
                }
            }
        }
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                // res += fill(grid, i, j) > 0 ? 1 : 0;
                // System.out.print(grid[i][j]);
                if(grid[i][j] == 1){
                    res++;
                }
            }
                // System.out.println();
        }
        return res;
    }
}