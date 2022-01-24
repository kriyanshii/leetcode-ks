class Solution {
    public boolean checkValid(int[][] matrix) {
        if(matrix == null || matrix.length < 1){
            return true;
        }
        int n = matrix.length;
        HashSet<Integer>[] row = new HashSet[n];
        HashSet<Integer>[] col = new HashSet[n];
        for(int i =0; i<n; i++){
            row[i] = new HashSet<Integer>();
            col[i] = new HashSet<Integer>();
        }
        for(int r=0; r<n; r++){
            for(int c=0; c<n; c++){
                int num =  matrix[r][c];
                if(row[r].contains(num)){
                    return false;
                }
                row[r].add(num);
                if(col[c].contains(num)){
                    return false;
                }
                col[c].add(num);
            }
        }
        return true;
    }
}