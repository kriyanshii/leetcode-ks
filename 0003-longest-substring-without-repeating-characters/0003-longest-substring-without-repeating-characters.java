class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, res = 0;
        Set<Character> set = new HashSet<>();
        while(j < s.length()){
            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i++));
            }else{
                res = Math.max(res, j - i + 1);
                set.add(s.charAt(j++));
            }
        }
        return res;
    }
}