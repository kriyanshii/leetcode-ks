class Solution {
    public int maximumSwap(int num) {
        char[] nums = String.valueOf(num).toCharArray();
        int[] maxIdx = new int[nums.length];
        int maxPos = nums.length - 1;
        maxIdx[maxPos] = maxPos;
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] > nums[maxPos]){
                maxPos = i;
            }
            maxIdx[i] = maxPos;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[maxIdx[i]]){
                char tmp = nums[i];
                nums[i] = nums[maxIdx[i]];
                nums[maxIdx[i]] = tmp;
                return Integer.parseInt(String.valueOf(nums));
            }
        }
        return num;
    }
}