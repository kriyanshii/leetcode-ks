class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        int unused = 0, ans = 0;
        for(String w: words){
            if(!map.containsKey(w)) map.put(w, 0);
            if(w.charAt(0) == w.charAt(1)){
                if(map.get(w) > 0){
                    unused--;
                    map.put(w, map.get(w) - 1);
                    ans += 4;
                }
                else{
                    map.put(w, map.get(w) + 1);
                    unused++;
                }   
            }else{
                String rev = Character.toString(w.charAt(1)) + Character.toString(w.charAt(0));
                if(map.containsKey(rev) && map.get(rev) > 0){
                    ans += 4;
                    map.put(rev, map.get(rev) - 1);
                }else{
                    map.put(w, map.get(w) + 1);
                }
            }
        }
        if(unused > 0) ans += 2;
        return ans;
    }
}