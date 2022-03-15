class Solution {
    public void setZeroes(int[][] matrix) {
        int R = matrix.length, C = matrix[0].length;
        Set<Integer> Rows = new HashSet<Integer>();
        Set<Integer> Cols = new HashSet<Integer>();
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(matrix[i][j] == 0){
                    Rows.add(i);
                    Cols.add(j);   
                }
            }
        }
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(Rows.contains(i) || Cols.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}