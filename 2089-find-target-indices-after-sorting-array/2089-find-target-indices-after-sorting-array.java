class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count = 0, lessThan = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                count++;
            }if(nums[i] < target){
                lessThan++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < count; i++){
            res.add(lessThan++);
        }
        return res;
    }
}