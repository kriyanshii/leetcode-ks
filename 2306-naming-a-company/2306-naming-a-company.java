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
                long countI = 0;
                long countJ = 0;
                for (String sI: sets[i]) {
                    if (!sets[j].contains(sI)) {
                        countI += 1;
                    }
                }
                for (String sJ: sets[j]) {
                    if (!sets[i].contains(sJ)) {
                        countJ += 1;
                    }
                }
                ans += countI * countJ;
            }
        }
        return ans * 2;
    }
}