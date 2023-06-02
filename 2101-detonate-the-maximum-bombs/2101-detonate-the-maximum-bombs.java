class Solution {
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length, ans = 0;
        for(int i = 0; i < n; i++){
            ans = Math.max(ans, dfs(i, new boolean[n], bombs));
        }
        return ans;
    }
    public int dfs(int index, boolean[] v, int[][] bombs){
        int count = 1;
        v[index] = true;
        int n = bombs.length;
        for(int i = 0; i < n; i++){
            if(!v[i] && inRange(bombs[index], bombs[i])){
                v[i] = true;
                count += dfs(i, v, bombs);
            }
        }
        return count;
    }
    
    public boolean inRange(int[] a, int[] b){
        long dx = a[0] - b[0], dy = a[1] - b[1], r = a[2];
        return dx * dx + dy * dy <= r * r;
    }
}