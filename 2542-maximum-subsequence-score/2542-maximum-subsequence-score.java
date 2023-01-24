class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] res = new int[n][2];
        for(int i = 0; i < nums1.length; i++){
            res[i] = new int[]{nums2[i], nums1[i]};
        }
        Arrays.sort(res, (a,b) -> (b[0] - a[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> a - b);
        long sum = 0, ans = 0;
        for(int[] r: res){
            pq.offer(r[1]);
            sum += r[1];
            if(pq.size() > k) sum -= pq.poll();
            if(pq.size() == k) ans = Math.max(ans, sum * r[0]);
        }
        return ans;
    }
}