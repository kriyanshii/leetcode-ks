class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        
        int i = 0, j = 0;
        int lastStarS = -1, lastStarP = -1;
        
        while (i < m) {
            if (j < n && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')) {
                i++;
                j++;
            } else if (j < n && p.charAt(j) == '*') {
                lastStarS = i;
                lastStarP = j;
                j++;
            } else if (lastStarP != -1) {
                i = lastStarS + 1;
                j = lastStarP + 1;
                lastStarS = i;
            } else {
                return false;
            }
        }
        
        for (int u = j; u < n; u++) {
            if (p.charAt(u) != '*')
                return false;
        }
        
        return true;
    }
}