class Solution {
    public int jump(int[] nums) {
        int far = 0, end = 0;
        int jump = 0;
        for(int i = 0; i < nums.length - 1; i++){
            far = Math.max(nums[i] + i, far);
            if(end == i){
                jump++;
                end = far;
                if(end >= nums.length - 1) return jump;
            }
        }
        return jump;
    }
}