class Solution {
    public int minDeletions(String s) {
        int count = 0;
        int[] freq = new int[26];
        for(char c: s.toCharArray()) freq[c - 'a']++;
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < 26; i++){
            while(freq[i] > 0 && !set.add(freq[i])){
                freq[i]--;
                count++;
            }
        }
        return count;
    }
}