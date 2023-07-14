class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        int n = arr.length;
        Map<Integer, Integer> dp = new HashMap<>();
        int ans = 1;
        for(int i = 0; i < n; i++){
            dp.put(arr[i], dp.getOrDefault(arr[i] - difference, 0) + 1);
            ans = Math.max(ans, dp.get(arr[i]));
        }
        return ans;
    }
}