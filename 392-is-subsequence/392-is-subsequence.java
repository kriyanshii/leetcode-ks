class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int sLen = 0, tLen = 0;
        while(tLen < t.length()){
            if(s.charAt(sLen) == t.charAt(tLen)){
                sLen++;
                if(sLen == s.length()) return true;
            }
            tLen++;
        }
        return false;
    }
}