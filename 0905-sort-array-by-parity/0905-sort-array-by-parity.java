class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0, r = nums.length - 1;
        while(l < r){
            if(nums[l] % 2 == 0){
                l++;
            }else if(nums[r] % 2 == 1){
                r--;
            }else if(nums[l] % 2 != 0 & nums[r] % 2 != 1){
                swap(nums, l, r);
                l++;
                r--;
            }
        }        
        return nums;
    }
    public void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}