class Solution {
    public int partitionString(String s) {
        int ans = 1;
        int mask = 0;
        for(char c: s.toCharArray()){
            int i = c - 'a';
            if((mask >> i & 1) == 1){
                mask = 1 << i;
                ans++;
            }else{
                mask |= 1 << i;
            }
        }
        return ans;
    }
}