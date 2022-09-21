class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;
        int[] res = new int[queries.length];
        for(int i: nums){
            if(i % 2 == 0)
                sum += i;
        }
        // System.out.println(sum);
        for(int i = 0; i < queries.length; i++){
            int idx = queries[i][1];
            if(nums[idx] % 2 == 0){
                sum -= nums[idx];
            }
            // System.out.println(sum);

            nums[idx] += queries[i][0];
            if(nums[idx] % 2 == 0){
                sum += nums[idx];
            }
            // System.out.println(sum);
            res[i] = sum;
        }
        return res;
    }
}