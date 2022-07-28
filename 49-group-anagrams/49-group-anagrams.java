class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] ca = new char[26];
            for(char c: str.toCharArray()) ca[c - 'a']++;
            String keystr = String.valueOf(ca);
            // System.out.println(keystr);
            if(!map.containsKey(keystr)) map.put(keystr, new ArrayList<>());
            map.get(keystr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}