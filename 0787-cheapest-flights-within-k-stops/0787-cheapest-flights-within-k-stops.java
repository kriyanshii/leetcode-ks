class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] cost = new int[n];
        Arrays.fill(cost, Integer.MAX_VALUE);
        cost[src] = 0;
        for(int i = 0; i <= k; i++){
            int[] tmp = Arrays.copyOf(cost, n);
            for(int[] f: flights){
                int cur = f[0], next = f[1], price = f[2];
                if(cost[cur] == Integer.MAX_VALUE)
                    continue;
                tmp[next] = Math.min(tmp[next], cost[cur] + price);
            }
            cost = tmp;
        }
        return cost[dst] == Integer.MAX_VALUE ? -1 : cost[dst];
    }
}