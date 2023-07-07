class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
       int maxf = 0, i = 0, n = answerKey.length(), count[] = new int[26];
        for (int j = 0; j < n; ++j) {
            maxf = Math.max(maxf, ++count[answerKey.charAt(j) - 'A']);
            if (j - i + 1 > maxf + k)
                --count[answerKey.charAt(i++) - 'A'];
        }
        return n - i;
    }
}