class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freqR = new int[26];
        int[] freqM = new int[26];
        for(char c: ransomNote.toCharArray()){
            freqR[c - 'a']++;
        }
        for(char c: magazine.toCharArray()){
            freqM[c - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(freqR[i] > freqM[i]){
                return false;
            }
        }
        return true;
    }
}