class Solution {
    public int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);
        int pairs = 0, lastChange = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                pairs += i - lastChange;
            }else{
                lastChange = i;
            }
        }
        return pairs;
    }
}