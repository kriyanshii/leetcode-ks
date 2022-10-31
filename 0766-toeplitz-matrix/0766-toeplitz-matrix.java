class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < r; i++){
            for(int j = 0;j < c; j++){
                int key = i - j;
                if(map.containsKey(key)){
                    if(map.get(key) != matrix[i][j]){
                        return false;
                    }
                }else{
                    map.put(key, matrix[i][j]);
                }
            }
        }
        return true;
    }
}