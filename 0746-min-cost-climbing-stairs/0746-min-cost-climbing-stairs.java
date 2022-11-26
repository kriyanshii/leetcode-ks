class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int first = cost[0];
        int second = cost[1];
        
        if(cost.length <= 2){
            return Math.min(first, second);
        }
        for(int i = 2; i < cost.length; i++){
            int cur = cost[i] + Math.min(first, second);
            first = second;
            second = cur;
        }
        return Math.min(first, second);
    }
}