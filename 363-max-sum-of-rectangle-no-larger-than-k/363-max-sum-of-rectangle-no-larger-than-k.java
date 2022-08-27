class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        int ans = Integer.MIN_VALUE;
        for(int r1 = 0; r1 < m; r1++){
            int[] arr = new int[n];
            for(int r2 = r1; r2 < m; r2++){
                for(int c = 0; c < n; c++) arr[c] += matrix[r2][c];
                ans = Math.max(ans, maxSubArray(arr, n, k));
            }
        }
        return ans;
    }
    
    public int maxSubArray(int[] arr, int n, int k){
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        int ans = Integer.MIN_VALUE;
        for(int i = 0, right = 0; i < n; i++){
            right += arr[i];
            Integer left = set.ceiling(right - k);
            if(left != null){
                ans = Math.max(ans, right - left);
            }
            set.add(right);
        }
        return ans;
    }
}