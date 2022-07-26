class Solution {
    public int maximumGap(int[] nums) {
        int min = nums[0], max = nums[0], n = nums.length;
        for(int i: nums){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        if(min == max){
            return 0;
        }
        int bucketLength = (int)Math.ceil((double)(max - min) / (n - 1));
        int[] minBucket = new int[n];
        int[] maxBucket = new int[n];
        Arrays.fill(minBucket, Integer.MAX_VALUE);
        Arrays.fill(maxBucket, Integer.MIN_VALUE);
        for(int x: nums){
            int idx = (x - min)/bucketLength;
            minBucket[idx] = Math.min(x, minBucket[idx]);
            maxBucket[idx] = Math.max(x, maxBucket[idx]);
        }
        int maxGap = bucketLength;
        int prev = maxBucket[0];
        for(int i = 1; i < n; i++){
            if(minBucket[i] == Integer.MAX_VALUE) continue;
            maxGap = Math.max(maxGap, minBucket[i] - prev);
            prev = maxBucket[i];
        }
        return maxGap;
    }
}