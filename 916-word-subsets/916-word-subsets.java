class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] count = new int[26], tmp;
        for(String word: words2){
            tmp = counter(word);
            for(int i = 0; i < 26; i++){
                count[i] = Math.max(count[i], tmp[i]);
                // System.out.println(count[i]);
            }
        }
        List<String> res = new ArrayList<>();
        for(String word: words1){
            int i;
            tmp = counter(word);
            for(i = 0; i < 26; i++){
                if(tmp[i] < count[i]){
                     break;
                }
            }
            if(i == 26) res.add(word);
        }
        return res;
    }
    
    public int[] counter(String word){
        int[] count = new int[26];
        for(char c: word.toCharArray()) count[c - 'a']++;
        return count;
    }
}