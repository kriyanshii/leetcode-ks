class Solution {
    static void rotate(int[] nums, int start, int end){
        while(start<end){
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
    
    public void rotate(int[] nums, int k) {
        k %= nums.length; //to check if k>n;
        rotate(nums, 0, nums.length -1);
        rotate(nums, 0, k-1);
        rotate(nums,k, nums.length -1);
    }
}