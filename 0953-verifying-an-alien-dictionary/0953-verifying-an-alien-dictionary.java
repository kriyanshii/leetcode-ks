class Solution {
    int[] mapping = new int[26];
    public boolean isAlienSorted(String[] words, String order) {
        for(int i = 0; i < 26; i++){
            mapping[order.charAt(i) - 'a'] = i;
        }
        for(int i = 1; i < words.length; i++){
            if(check(words[i - 1], words[i])){
                return false;
            }
        }
        return true;
    }
    
    public boolean check(String s1, String s2){
        int n = s1.length(), m = s2.length();
        for(int i = 0; i < m && i < n; i++){
            if(s1.charAt(i) != s2.charAt(i))
                return mapping[s1.charAt(i) - 'a'] > mapping[s2.charAt(i) - 'a'];
        }
        return n > m;
    }
}