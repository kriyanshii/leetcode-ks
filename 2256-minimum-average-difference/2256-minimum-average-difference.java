class Solution {
    public int minimumAverageDifference(int[] nums) {
        // long sum = 0, min = Integer.MAX_VALUE;
        // for(int i: nums) sum += i;
        // int leftIndex = 0, index = 0;
        // int prefix = 0;
        // for(int i = 0; i < nums.length; i++){
        //     prefix += nums[i];
        //     long suffix = sum - prefix;
        //     long leftAvg = prefix / (i + 1);
        //     // long rightAvg = suffix != 0 ? suffix / (nums.length - i - 1) : 0;
        //     if(suffix != 0) suffix /= (nums.length - i - 1);
        //     long res = Math.abs(leftAvg - suffix);
        //     if(res < min){
        //         min = res;
        //         index = i;
        //     }
        // }
        // return index;
            long min = Integer.MAX_VALUE, sum = 0;
    for (int i : nums) sum += i;
    int leftIndex = 0, resultIndex = -1;
    long prefixSum = 0;

    while (leftIndex < nums.length) {
        prefixSum += nums[leftIndex];
        long leftAverage = prefixSum / (leftIndex + 1);
        long sumRight = sum - prefixSum;
        if (sumRight != 0) sumRight /= nums.length - leftIndex - 1;
        long res = Math.abs(leftAverage - sumRight);
        if (res < min) {
            min = res;
            resultIndex = leftIndex;
        }
        leftIndex++;
    }
    return resultIndex;
        
    }
}
