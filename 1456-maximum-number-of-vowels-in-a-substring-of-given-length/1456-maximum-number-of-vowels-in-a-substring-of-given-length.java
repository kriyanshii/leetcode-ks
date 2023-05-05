class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for(int i = 0, count = 0; i < s.length(); i++){
            if(vowels.contains(s.charAt(i))){
                count++;
            }
            if(i >= k && vowels.contains(s.charAt(i - k))){
                count--;
            }
            ans = Math.max(count, ans);
        }
        return ans;
    }
}