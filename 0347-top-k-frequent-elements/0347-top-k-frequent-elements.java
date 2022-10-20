class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> map.get(o1) - map.get(o2));
        for(int key: map.keySet()){
            pq.add(key);
            if(pq.size() > k){
                pq.poll();
            }
        }
        int[] res = new int[k];
        while(!pq.isEmpty()){
            res[--k] = pq.poll();
        }
        return res;
    }
}