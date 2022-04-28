class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        int[] arr = new int[2];
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index+1){
                arr[0] = nums[index];
                arr[1] = index + 1;
            }
        }
        return arr;
    }
    public void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}