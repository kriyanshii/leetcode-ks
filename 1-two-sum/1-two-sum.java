class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmp = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int diff = target - nums[i];
            if(hmp.containsKey(diff)){
                return new int[] {hmp.get(diff), i};
            }
            hmp.put(nums[i],i);
        }
        return null;
    }
}