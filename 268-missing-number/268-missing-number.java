class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i < n){
            int correct = nums[i];
            if(nums[i] < n && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        for(int j=0; j<n; j++){
            // System.out.println(nums[j]);
            if(nums[j] != j){
                return j;
            }
        }
        
        return n;
    }
    
    public void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}