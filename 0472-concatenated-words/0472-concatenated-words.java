class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        Arrays.sort(words, new Comparator<String>(){
           public int compare(String s1, String s2){
               return s1.length() - s2.length();
           }
        });
        
        for(int i = 0; i < words.length; i++){
            if(check(words[i], set)){
                list.add(words[i]);
            }
            set.add(words[i]);
        }
        return list;
    }
    
    public boolean check(String word, HashSet<String> dict){
        if(dict.isEmpty()) return false;
        boolean[] dp = new boolean[word.length() + 1];
        dp[0] = true;
        for(int i = 1; i <= word.length(); i++){
            for(int j = 0; j < i; j++){
                if(!dp[j]) continue;
                if(dict.contains(word.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[word.length()];
    }
}