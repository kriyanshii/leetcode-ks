class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        HashMap<Integer, PriorityQueue<Integer>> d= new HashMap<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                d.putIfAbsent(i-j, new PriorityQueue<>());
                d.get(i - j).add(mat[i][j]);
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = d.get(i - j).poll();
            }
        }
        return mat;
    }
}