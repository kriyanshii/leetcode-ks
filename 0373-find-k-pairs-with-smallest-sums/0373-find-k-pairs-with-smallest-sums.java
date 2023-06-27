class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] + a[0] - b[1] - b[0]);
        List<List<Integer>> res = new ArrayList<>();
        if(nums1.length == 0 || nums2.length == 0 || k == 0) return res;
        for(int i = 0; i < nums1.length && i < k; i++){
            queue.offer(new int[] {nums1[i], nums2[0], 0});
        }
        while(k-- > 0 && !queue.isEmpty()){
            int[] cur = queue.poll();            
            List<Integer> pair = new ArrayList<>();
            pair.add(cur[0]);
            pair.add(cur[1]);
            res.add(pair);
            if(cur[2] == nums2.length - 1) continue;
            queue.offer(new int[] {cur[0], nums2[1 + cur[2]], 1 + cur[2]});
        }
        return res;
    }
}