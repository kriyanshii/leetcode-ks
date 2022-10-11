class Solution {
    public char repeatedCharacter(String s) {
        int[] freq = new int[26];
        for(char c: s.toCharArray()){
            if(freq[c - 'a'] == 1){
                return c;
            }else{
                freq[c - 'a']++;
            }
        }
        return 'a';
    }
}