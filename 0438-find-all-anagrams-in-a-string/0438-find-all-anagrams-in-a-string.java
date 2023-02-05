class Solution {
    public List<Integer> findAnagrams(String s, String p) {
            List<Integer> list = new ArrayList<Integer>();

    if(p.length() > s.length()) return list;
    int lenS = s.length();
    int lenP = p.length();

    int[] count = freq(p);
    int[] currCount = freq(s.substring(0, lenP));

    if(areSame(currCount, count)){
        list.add(0);
    }

    for(int i = lenP; i < lenS; i++){
        currCount[s.charAt(i - lenP) - 'a']--;
        currCount[s.charAt(i) - 'a']++;
        if(areSame(currCount, count)){
            list.add(i - lenP + 1);
        }
    }
    return list;
    }
    
    public boolean areSame(int[] x, int[] y){
        for(int i = 0; i < 26; i++){
            if(x[i] != y[i]){
                return false;
            }
        }
        return true;
    }
    
    public int[] freq(String s){
        int[] count = new int[26];
        for(char c: s.toCharArray()){
            count[c - 'a']++;
        }
        return count;
    }
}