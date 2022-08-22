class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int lastDay = days[days.length - 1];
        
        int[] dp = new int[lastDay + 1];
        boolean[] isTravel = new boolean[lastDay + 1];
        
        for(int day: days) isTravel[day] = true;
        
        for(int i = 1; i <= lastDay; i++){
            if(!isTravel[i]){
                dp[i] = dp[i - 1];
                continue;
            }
            dp[i] = dp[i - 1] + costs[0];
            dp[i] = Math.min(dp[i], dp[Math.max(i - 7, 0)] + costs[1]);
            dp[i] = Math.min(dp[i], dp[Math.max(i - 30, 0)] + costs[2]);
        }
        return dp[lastDay];
    }
}