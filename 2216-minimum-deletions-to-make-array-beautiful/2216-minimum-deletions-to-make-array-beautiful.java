class Solution {
    public int minDeletion(int[] nums) {
        int res = 0, pre = -1;
        for(int a: nums){
            if(pre == a){
                res++;
            }else{
                pre = pre < 0 ? a : -1;
            }
        }
        return pre < 0 ? res : res + 1;
    }
}