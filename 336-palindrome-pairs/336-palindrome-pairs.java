class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        HashMap<String, Integer> wordMap = new HashMap<>();
        Set<Integer> set = new TreeSet<>();
        int n = words.length;
        
        for(int i = 0; i < n; i++){
            wordMap.put(words[i], i);
            set.add(words[i].length());
        }
        
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            int len = words[i].length();
            if(len == 1){
                if(wordMap.containsKey("")){
                    list.add(Arrays.asList(i, wordMap.get("")));
                    list.add(Arrays.asList(wordMap.get(""), i));
                }
                continue;
            }
            // abcd and dcba
            String reverse = new StringBuilder(words[i]).reverse().toString();
            if(wordMap.containsKey(reverse) && wordMap.get(reverse) != i){
                list.add(Arrays.asList(i, wordMap.get(reverse)));
            }
            // lls and s
            for(Integer k: set){
                if(k == len){
                    break;
                }
                if(isPallindrome(reverse, 0, len - 1 - k)){ // check for ll
                    String s1 = reverse.substring(len - k); // takes s
                    if(wordMap.containsKey(s1)){
                        list.add(Arrays.asList(i, wordMap.get(s1))); // add s and lls
                    }
                }
                if(isPallindrome(reverse, k, len - 1)){
                    String s2 = reverse.substring(0, k);
                    if(wordMap.containsKey(s2)){
                        list.add(Arrays.asList(wordMap.get(s2), i));
                    }
                }
            }
        }
        return list;
    }
    
    private boolean isPallindrome(String s, int left, int right){
        while(left<right)
            if(s.charAt(left++)!=s.charAt(right--))
                return false;
        return true;
    }
}