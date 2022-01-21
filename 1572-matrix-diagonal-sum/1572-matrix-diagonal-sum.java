class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0, n = mat.length, j= n - 1;
        for(int i=0; i<n; i++){
            sum += mat[i][i];
            sum += mat[i][j--];
            if(i == j+1){
                sum -= mat[i][j+1];
            }
        }
        return sum;
    }
}