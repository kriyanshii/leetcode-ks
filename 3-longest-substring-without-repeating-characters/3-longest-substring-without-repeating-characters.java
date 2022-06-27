class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int[] cache = new int[128];
        
        for (int i = 0, j = 0; i < s.length(); i++) {
            j = Math.max(j, cache[s.charAt(i)]);
            cache[s.charAt(i)] = i + 1;
            result = Math.max(result, i - j + 1);
        }
        
        return result;
    }
}