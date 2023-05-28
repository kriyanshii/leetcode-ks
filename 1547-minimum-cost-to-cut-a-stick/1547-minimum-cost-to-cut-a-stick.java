class Solution {
    public int minCost(int n, int[] cuts) {
        List<Integer> list = new ArrayList<>();
        for(int a: cuts){
            list.add(a);
        }
        list.add(0);
        list.add(n);
        Collections.sort(list);
        int k = list.size();
        int[][] dp = new int[k][k];
        for(int d = 2; d < k; d++){
            for(int i = 0; i < k - d; i++){
                dp[i][i + d] = Integer.MAX_VALUE;
                for(int m = i+1; m < i + d; m++){
                    dp[i][i + d] = Math.min(dp[i][i + d], dp[i][m] + dp[m][i + d] + list.get(i + d) - list.get(i));
                }
            }
        }
        return dp[0][k - 1];
    }
}