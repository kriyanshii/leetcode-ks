class Solution {
    public int addMinimum(String word) {
        int k = 0, n = word.length(), prev = 'z';
        for(int i = 0; i < n; i++){
            k += (word.charAt(i) <= prev ? 1 : 0);
            prev = word.charAt(i);
        }
        return 3 * k - n;
    }
}