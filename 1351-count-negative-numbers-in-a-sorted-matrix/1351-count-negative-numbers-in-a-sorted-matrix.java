class Solution {
    public int countNegatives(int[][] grid) {
        int negativeNum = 0, row = grid.length, column = grid[0].length;
        for(int i=0;i<row ;i++){
            for(int j=0;j<column;j++){
                if(grid[i][j] < 0){
                    negativeNum++;
                }
            }
        }
        return negativeNum;
    }
}