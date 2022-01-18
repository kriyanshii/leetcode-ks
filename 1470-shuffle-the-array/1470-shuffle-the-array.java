class Solution {
    public int[] shuffle(int[] nums, int n) {
        int left=0, mid =n;
        int[] ans =new int[2*n];
        for(int i=0; i<2*n;i+=2){
            ans[i] = nums[left++];
            ans[i+1] = nums[mid++];
        }
        return ans;
    }
}