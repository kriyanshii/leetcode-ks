class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] ans = new int[nums.length];
        long sum = 0;
        // Arrays.fill(ans, -1);
        for(int i = 0; i < nums.length; i++){
            if(i < k) ans[i] = -1;
            sum += nums[i];
            // System.out.println((int)(sum / (2*k + 1)));
            if(i >= 2*k){
                ans[i - k] = (int)(sum / (2*k + 1));
                sum -= nums[i - 2*k];
            }
            if(i >= nums.length - k) ans[i] = -1;
        }
        return ans;
    }
}