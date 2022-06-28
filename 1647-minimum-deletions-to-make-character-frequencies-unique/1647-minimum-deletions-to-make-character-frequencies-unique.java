class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        int count = 0;
        for(char c: s.toCharArray()){
            freq[c - 'a']++;
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < 26; i++){
            if(freq[i] != 0) {
                while(set.contains(freq[i]) && freq[i]>0) {
                    freq[i]--;
                    count++;
                }
                set.add(freq[i]);
            }
        }
        return count;
    }
}