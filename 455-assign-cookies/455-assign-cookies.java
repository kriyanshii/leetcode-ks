class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int j = 0; i < g.length && j < s.length; j++){
            if(g[i] <= s[j]){
                i++;
            }
        }
        return i;
    }
}