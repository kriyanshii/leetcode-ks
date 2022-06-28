class Solution {
    public int minIncrementForUnique(int[] nums) {
        int res = 0, need = 0;
        Arrays.sort(nums);
        for(int a : nums){
            res += Math.max(need - a, 0);
            need = Math.max(need, a) + 1;
        }
        return res;
    }
}