class Solution {
    public int getMaxLen(int[] nums) {
        int firstNeg = -1, zero = -1, negs = 0, res = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                negs++;
                if(firstNeg == -1) firstNeg = i;
            }if(nums[i] == 0){
                zero = i;
                negs = 0;
                firstNeg = -1;
            }
            else{
                if(negs % 2 == 0){
                    res = Math.max(i - zero, res);
                }else{
                    res = Math.max(i - firstNeg, res);
                }
            }
        }
        return res;
    }
}