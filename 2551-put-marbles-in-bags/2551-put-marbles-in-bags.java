class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length - 1;
        long res[] = new long[n], ans = 0;
        for (int i = 0; i < res.length; i++) {
            res[i] = weights[i] + weights[i + 1];
        }
        Arrays.sort(res);
        for (int i = 0; i < k - 1; i++) {
            ans += res[n - 1 - i] - res[i];
        }
        return ans;
    }
}