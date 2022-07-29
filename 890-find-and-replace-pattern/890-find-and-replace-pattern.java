class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int[] p = freq(pattern);
        List<String> list = new ArrayList<String>();
        for(String w: words){
            if(Arrays.equals(freq(w), p)) list.add(w);
        }
        return list;
    }
    
    public int[] freq(String w){
        HashMap<Character, Integer> map = new HashMap<>();
        int[] res = new int[w.length()];
        for(int i = 0; i < w.length(); i++){
            map.putIfAbsent(w.charAt(i), map.size());
            res[i] = map.get(w.charAt(i));
        }
        return res;
    }
}