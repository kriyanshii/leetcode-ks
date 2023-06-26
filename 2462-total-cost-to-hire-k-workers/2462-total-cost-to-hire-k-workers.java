class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int left = 0, right = costs.length - 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (costs[a]- costs[b] != 0 ? costs[a] - costs[b] : a - b));
        for(int i = 0; i < candidates && left <= right; i++){
            // System.out.println(left);
            pq.add(left++);
            if(left <= right){
                pq.add(right--);
                // System.out.println(right);
            } 
        }
        long res = 0;
        while (k > 0) {
            int idx = pq.poll();
            // System.out.println(idx);
            if (left <= right && left < costs.length && right >= 0) {
                if (idx <= left) pq.add(left++);
                else pq.add(right--);
            }
            res += costs[idx];
            k--;
        }
        return res;
    }
}