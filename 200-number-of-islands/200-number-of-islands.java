class Solution {
    public int n;
    public int m;
    
    public int numIslands(char[][] grid) {
        n = grid.length;
        m = grid[0].length;
        int count = 0;
        if(n == 0) return 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == '1'){
                    DFSMarking(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    
    public void DFSMarking(char[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1'){
            return;
        }
        grid[i][j] = '0';
        DFSMarking(grid, i + 1, j);
        DFSMarking(grid, i - 1, j);
        DFSMarking(grid, i, j + 1);
        DFSMarking(grid, i, j - 1);
    }
}