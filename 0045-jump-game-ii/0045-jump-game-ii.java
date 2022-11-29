class Solution {
    public int jump(int[] nums) {
        int curEnd = 0, curFarthest = 0;
        int jump = 0;
        for(int i = 0; i < nums.length - 1; i++){
            curFarthest = Math.max(i + nums[i], curFarthest);
            if(curEnd == i){
                curEnd = curFarthest;
                jump++;
            }
        }
        return jump;
    }
}