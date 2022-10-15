class Solution {
    public int sumOfBeauties(int[] nums) {
        int sum = 0, n = nums.length;
        int[] min = new int[n + 1];
        min[n] = Integer.MAX_VALUE;
        for(int j = n - 1; j >= 0; j--){
            min[j] = Math.min(nums[j], min[j+1]);
            // System.out.println(max[i + 1]);
            // System.out.println(min[j]);
        }
        for(int i = 1, max = nums[0]; i < n - 1; i++){
            if(max < nums[i] && nums[i] < min[i+1]){
                sum += 2;
            }else if(nums[i-1] < nums[i] && nums[i] < nums[i+1]){
                sum++;
            }
            max = Math.max(nums[i], max);
        }
        return sum;
    }
}