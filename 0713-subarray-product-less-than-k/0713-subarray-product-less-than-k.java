class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k == 0) return 0;
        int product = 1;
        int count = 0;
        for(int i = 0, j = 0; j < nums.length; j++){
            product *= nums[j];
            while(product >= k && i<=j){
                product /= nums[i++];
            }
            count += (j - i + 1);
        }
        return count;
    }
}