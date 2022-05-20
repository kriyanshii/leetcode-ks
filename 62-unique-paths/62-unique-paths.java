class Solution {
    public int uniquePaths(int m, int n) {
        return uniquePath(m-1, n-1, new int[n][m]);
    }
    
    public int uniquePath(int m ,int n, int[][] memory){
        if(m < 0 || n < 0) return 0;
        else if(m ==0 || n == 0) return 1;
        else if(memory[n][m] > 0) return memory[n][m];
        else{
            memory[n][m] = uniquePath(m-1, n, memory) + uniquePath(m, n-1, memory);
            return memory[n][m];
        }
    }
}