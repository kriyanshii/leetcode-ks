class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for(int key: map.keySet()){
            if(map.get(key) > 0){
                for(int i = k - 1; i >= 0; --i){
                    if(map.getOrDefault(i + key, 0) < map.get(key)) return false;
                    map.put(i + key, map.get(i + key) - map.get(key));
                }
            }
        }
        return true;
    }
}