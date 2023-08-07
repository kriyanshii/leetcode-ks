class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false; 
        int row = matrix.length, col = matrix[0].length;
        int start = 0, end = row*col - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(matrix[mid/ col][mid % col] == target){
                return true;
            }
            if(matrix[mid/ col][mid % col] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }
}