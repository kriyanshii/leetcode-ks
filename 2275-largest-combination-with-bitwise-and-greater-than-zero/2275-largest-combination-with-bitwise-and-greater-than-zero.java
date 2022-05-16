class Solution {
    public int largestCombination(int[] candidates) {
        int res = 0, cur = 0;
        for(int i=0; i<30; i++){
            cur = 0;
            for(int a : candidates){
                cur += a>>i & 1;
            }
            res = Math.max(cur, res);
        }
        return res;
    }
}