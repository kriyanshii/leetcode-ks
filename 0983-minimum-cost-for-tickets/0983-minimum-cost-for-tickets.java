class Solution {
    public int mincostTickets(int[] days, int[] cost) {
        //brilliant
        int lastDay = days[days.length - 1];
        int[] dp = new int[lastDay + 1];
        boolean[] travelDay = new boolean[lastDay + 1];
        for(int i: days) travelDay[i] = true;
        for(int i  = 1; i <= lastDay; i++){
            if(!travelDay[i]){
                dp[i] = dp[i - 1];
                continue;
            }
            dp[i] = dp[i - 1] + cost[0];
            dp[i] = Math.min(dp[i],dp[Math.max(i - 7, 0)] + cost[1]);
            dp[i] = Math.min(dp[i], dp[Math.max(i - 30, 0)] + cost[2]);
        }
        return dp[lastDay];
    }
}