class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for(String str: words){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        int ans = 0;
        char[] ch = s.toCharArray();
        for(String str: map.keySet()){
            char[] tmp = str.toCharArray();
            int i = 0;
            int j = 0;
            while(i < ch.length && j < tmp.length){
                if(ch[i]== tmp[j]){
                    i++;
                    j++;
                }else{
                    i++;
                }
            }
            if(j == tmp.length){
                ans += map.get(str);
            }
        }
        return ans;
    }
}