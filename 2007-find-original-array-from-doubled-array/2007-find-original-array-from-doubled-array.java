class Solution {
    public int[] findOriginalArray(int[] nums) {
        int n = nums.length;
        if(n % 2 == 1) return new int[0];
        int[] res = new int[n/2];
        // TreeMap cause we want keys sorted
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int x = 0; // integer to map the res;
        for(int i: map.keySet()){
            if(map.get(i) > map.getOrDefault(i*2, 0)){
                return new int[0];
            }
            for (int j = 0; j < map.get(i); ++j) {
                res[x++] = i;
                map.put(i + i, map.get(i + i) - 1);
            }
        }
        return res;        
    }
}