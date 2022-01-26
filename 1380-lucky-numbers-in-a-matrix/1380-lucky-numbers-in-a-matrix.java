class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNum = new ArrayList<Integer>();
        int m = matrix.length;
        int n = matrix[0].length;
        int row[] = new int[m];
        int col[] = new int[n];
        Arrays.fill(row, Integer.MAX_VALUE);
        Arrays.fill(col, Integer.MIN_VALUE);
        for(int r=0; r<m; r++){
            for(int c=0; c<n; c++){
                int a = matrix[r][c];
                row[r] = Math.min(row[r], a);
            }
        }
        for(int c=0; c<n; c++){
            for(int r=0; r<m; r++){
                int a = matrix[r][c];
                col[c] = Math.max(col[c], a);
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int val = matrix[i][j];
                if(val <= row[i] && val >= col[j]){
                    luckyNum.add(val);
                }
            }
        }
        return luckyNum;
    }
}