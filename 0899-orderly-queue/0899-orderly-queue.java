class Solution {
    public String orderlyQueue(String s, int k) {
        if(k > 1){
            char s2[] = s.toCharArray();
            Arrays.sort(s2);
            return new String(s2);
        }
        
        String res = s;
        for (int i = 1; i < s.length(); i++) {
            String tmp = s.substring(i) + s.substring(0, i);
            if (res.compareTo(tmp) > 0) res = tmp;
        }
        return res;
    }
}