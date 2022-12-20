class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length, l = 1, r = 1, res = nums[0];
        for(int i = 0; i < nums.length; i++){
            l = (l == 0 ? 1 : l) * nums[i];
            r = (r == 0 ? 1 : r) * nums[n - i - 1];
            res = Math.max(res, Math.max(l, r));
        }
        return res;
    }
}