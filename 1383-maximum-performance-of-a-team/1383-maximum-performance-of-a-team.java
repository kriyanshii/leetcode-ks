class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] performance = new int[n][2];
        for(int i = 0; i < n; i++){
            performance[i] = new int[] {efficiency[i], speed[i]};
        }
        Arrays.sort(performance, (a, b) -> b[0] - a[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a,b) -> a - b);
        long res = 0, sumS = 0;
        for(int[] per: performance){
            pq.add(per[1]);
            sumS = sumS + per[1];
            if(pq.size() > k) sumS -= pq.poll();
            res = Math.max(res, sumS * per[0]);
        }
        return (int) (res % (long)(1e9 + 7));
    }
}