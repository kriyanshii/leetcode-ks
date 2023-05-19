class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = 10001;
        int[] count = new int[n];
        for(int val: nums){
            count[val] += val;
        }
        int take = 0, skip = 0;
        for(int i = 0; i < n; i++){
            int tmp = take;
            take = Math.max(take, skip + count[i]);
            skip = tmp;
        }
        return take;
    }
}