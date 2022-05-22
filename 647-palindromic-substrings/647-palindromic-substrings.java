class Solution {
    int count = 0;
    public int countSubstrings(String s) {
        if(s == null || s.length() == 0) return 0;
        for(int i=0; i<s.length(); i++){
            extendedLength(i,i,s);
            extendedLength(i, i+1, s);
        }
        return count;
    }
    
    private void extendedLength(int left, int right, String s){
        while(right < s.length() && left >= 0 && s.charAt(left) == s.charAt(right)){
            count++;
            right++;
            left--;
        }
    }
}