class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freqB = new int[26], freqT = new int[26];
        int min = text.length();
        for(char c: text.toCharArray()){
            freqT[c - 'a']++;
        }
        for(char c: "balloon".toCharArray()){
            freqB[c - 'a']++;
        }
        for(char c: "balloon".toCharArray()){
            min = Math.min(min, freqT[c - 'a']/freqB[c-'a']);
        }
        return min;
    }
}