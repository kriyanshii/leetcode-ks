class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = 10001;
        int[] values = new int[n];
        for(int value: nums){
            values[value] += value;
        }
        int take = 0, skip = 0;
        for(int i = 0; i <values.length; i++){
            int tmp = take;
            take = skip + values[i];
            skip = Math.max(skip, tmp);
        }
        return Math.max(take, skip);
    }
}