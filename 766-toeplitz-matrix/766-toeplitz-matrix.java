class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        HashMap<Integer, Integer> hmp = new HashMap<>();
        for(int i=0; i<r;i++){
            for(int j=0;j<c;j++){
                int key = i-j;
                if(hmp.containsKey(key)){
                     if(hmp.get(key) != matrix[i][j]){
                         return false;
                     }
                }else{
                    hmp.put(key, matrix[i][j]);
                }
            }
        }
        return true;
    }
}