class Solution {
    public long distinctNames(String[] ideas) {
        long ans = 0;
        HashSet<String>[] sets = new HashSet[26];
        for(int i = 0; i < 26; i++){
            sets[i] = new HashSet<>();
        }
        for(String s: ideas){
            char head = s.charAt(0);
            sets[head - 'a'].add(s.substring(1));
        }
        for(int i = 0; i < sets.length; i++){
            for(int j = i + 1; j <sets.length; j++){
                long ansI = 0;
                long ansJ = 0;
                for(String s: sets[i]){
                    if(!sets[j].contains(s)){
                        ansI += 1;
                    }
                }
                for(String s: sets[j]){
                    if(!sets[i].contains(s)){
                        ansJ += 1;
                    }
                }
                ans += ansI * ansJ;
            }
        }
        return ans * 2;
    }
}