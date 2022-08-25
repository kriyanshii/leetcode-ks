class Solution {
    public int minimumOperations(int[] nums) {
        int[][] freq = new int[100005][2];
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            freq[nums[i]][i&1]++;
        }
        
        for(int i = 0, j = 0, k = 0; i <= 100000; i++){
            ans = Math.max(ans, Math.max(freq[i][0] + k, freq[i][1] + j));
            j = Math.max(j, freq[i][0]);
            k = Math.max(k, freq[i][1]);
        }
        return nums.length - ans;
    }
}