class Solution {
    int MOD = 1000000000 + 7;
    HashMap<String, Integer> memo = new HashMap<>();
    public int numRollsToTarget(int n, int f, int target) {
        long[] dp = new long[target + 1];
        dp[0] = 1;
        for(int i = 1; i <= n; i++){
            for(int j = target; j >= 0; j--){
                dp[j] = 0;
                for(int k = 0; k <= f; k++){
                    if(j >= k){
                        dp[j] = (dp[j] + dp[j - k]) % MOD;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return (int)dp[target];
    }
}