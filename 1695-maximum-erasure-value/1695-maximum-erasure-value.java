class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i = 0, j = 0, sum = 0, ans = 0;
        while(i < nums.length && j < nums.length){
            if(!set.contains(nums[j])){
                sum += nums[j];
                ans = Math.max(ans, sum);
                set.add(nums[j++]);
            }else{
                sum -= nums[i];
                set.remove(nums[i++]);
            }
        }
        return ans;
    }
}