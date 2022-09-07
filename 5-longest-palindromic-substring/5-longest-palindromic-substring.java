class Solution {
    int lo, maxLen;
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len < 2) return s;
        
        for(int i = 0; i < len - 1; i++){
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i + 1);
        }
        return s.substring(lo, lo + maxLen);
    }
    
    public void extendPalindrome(String s, int x, int y){
        while(x >= 0 && y < s.length() && s.charAt(x) == s.charAt(y)){
            x--;
            y++;
        }
        
        if(maxLen < y - x - 1){
            lo = x + 1;
            maxLen = y - x - 1;
        }
    }
}