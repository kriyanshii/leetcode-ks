class Solution {
    private static final int mod = 1_000_000_007;
    public int numTilings(int n) {
        int p3 = -1, p2 = 0, p1 = 1;
        for(int i = 0; i < n; i++){
            int cur = (int)((2L * p1 + p3) % mod);
            p3 = p2;
            p2 = p1;
            p1 = cur;
        }
        return p1;
    }
}