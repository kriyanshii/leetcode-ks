class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int i = 0, maxf = 0;
        for(int j = 0; j < s.length(); j++){
            maxf = Math.max(maxf, ++count[s.charAt(j) - 'A']);
            if(j - i + 1 > maxf + k){
                --count[s.charAt(i++) - 'A'];
            }
        }
        return s.length() - i;
    }
}