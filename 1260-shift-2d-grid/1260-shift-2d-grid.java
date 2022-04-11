class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List <List<Integer>> result = new ArrayList();
        int row = grid.length, col = grid[0].length;
        for(int i=0; i<row; i++){
            result.add(new ArrayList());
        }
        k %= row * col;
        int dimension = row * col;
        int begin = dimension - k;
        int x = 0;
        for(int i = begin; i< begin + dimension; i++){
            int r = (i / col)  % row, c = i % col;
            result.get(x / col).add(grid[r][c]);
            x++;
        }
        return result;
    }
}