class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = 0, min = 0, sum = 0;
        for(int i: nums){
            sum += i;
            min = Math.min(min, sum);
            max = Math.max(max, sum);
        }
        return max - min;
    }
}