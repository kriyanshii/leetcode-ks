class Solution {
    public int[][] transpose(int[][] matrix) {
        int R = matrix.length, C = matrix[0].length; 
        int[][] ans = new int[C][R];
        for(int c=0; c<matrix[0].length; c++){
            for(int r=0; r<matrix.length; r++){
                ans[c][r] = matrix[r][c];
            }
        }
        return ans;
    }
}