class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0, sum = 0;
        for(int i: nums){
            sum = (sum + i) % k;
            if(sum < 0){
                sum += k;
            }
            count += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
