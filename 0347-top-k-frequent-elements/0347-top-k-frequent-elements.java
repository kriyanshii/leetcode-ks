class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //we sort in a frequency list
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        // now we sort frequency list in bucket
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for(int key: map.keySet()){
            int frequency = map.get(key);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        // now we store top k frequent elements;
        int[] res = new int[k];
        int index = 0;
        for(int i = bucket.length - 1; i >= 0; i--){
            if(bucket[i] != null){
                for(int val: bucket[i]){
                    res[index++] = val;
                    if(index == k) return res;
                }
            }
        }
        return res;
    }
}