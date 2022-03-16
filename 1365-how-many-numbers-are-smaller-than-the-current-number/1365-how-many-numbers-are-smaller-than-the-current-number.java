class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int prevSum = 0;
        for(int i=0; i<101;i++){
            int now = count[i];
            count[i] = prevSum;
            prevSum += now;
        }
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            res[i] = count[nums[i]];
        }
        return res;
    }
}
