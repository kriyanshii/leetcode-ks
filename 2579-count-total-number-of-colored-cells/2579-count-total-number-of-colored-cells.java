class Solution {
    public long coloredCells(int n) {
        long ans = 0;
        int i, odd = 1;
        for(i = 1; i < n; i++){
            ans += (2 * odd);
            odd += 2;
        }
        ans += odd;
        return ans;

    }
}