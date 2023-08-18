class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        boolean[][] connected = new boolean[n][n];
        int[] count = new int[n];
        for(int[] i: roads){
            count[i[0]]++;
            count[i[1]]++;
            connected[i[0]][i[1]] = true;
            connected[i[1]][i[0]] = true;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) 
            for (int j = i + 1; j < n; j++) 
                ans = Math.max(ans, count[i] + count[j] - (connected[i][j] ? 1 : 0));
        return ans;
    }
}