class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap();
        for(int m : nums){
            count.put(m, count.getOrDefault(m, 0) + 1);
        }
        //init heap 
        PriorityQueue <Integer> heap = new PriorityQueue<>((o1, o2) -> count.get(o1) - count.get(o2));
        //for each entry mmap add it ti mean hul\l
        for(int n: count.keySet()){
            heap.add(n);
            if(heap.size() > k) heap.poll();
        }
        
        //build an output array
        int[] top = new int[k];
        for(int i=k-1; i>=0; --i){
            top[i] = heap.poll();
        }
        return top;
    }
}