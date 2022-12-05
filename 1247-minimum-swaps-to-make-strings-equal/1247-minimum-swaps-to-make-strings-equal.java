class Solution {
    public int minimumSwap(String s1, String s2) {
        if(s1.length() != s2.length()) return -1;
        int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(i)) continue; // doesnt count repeated chars.
            if(s1.charAt(i) == 'x'){
                x1++;
            }
            if(s1.charAt(i) == 'y'){
                y1++;
            }
            if(s2.charAt(i) == 'x'){
                x2++;
            }
            if(s2.charAt(i) == 'y'){
                y2++;
            }
        }
        
        if((x1 + x2) % 2 != 0 || (y1 + y2) % 2 != 0) return -1;
        int swaps = x1/2 + y1/2 + (x1 % 2) * 2;
        return swaps;
    }
}