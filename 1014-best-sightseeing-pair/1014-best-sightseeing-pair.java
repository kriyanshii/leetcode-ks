class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int res = 0, cur = 0;
        for(int a: values){
            res = Math.max(res, cur + a);
            cur = Math.max(cur, a) - 1;
        }
        return res;
    }
}