class Solution {
    public int countVowelSubstrings(String word) {
        int start = 0, mid = 0, end = 0, res = 0, vowels = 0;
        int[] chars = new int[26];
        while (end < word.length()) {
            if (isVowel(word.charAt(end))) {
                chars[word.charAt(end) - 'a']++;
                if (chars[word.charAt(end) - 'a'] == 1) {
                    vowels++;
                }
                while (vowels == 5) {
                    chars[word.charAt(mid) - 'a']--;
                    if (chars[word.charAt(mid) - 'a'] == 0) {
                        vowels--;
                    }
                    mid++;
                }
                res += (mid - start);
            } else {
                start = end + 1;
                mid = start;
                vowels = 0;
                chars = new int[26];
            }
            end++;
        }
        return res;
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    } 
}