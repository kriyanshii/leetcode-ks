https://leetcode.com/problems/maximum-sum-circular-subarray/discuss/178422/One-Pass
```
int total = 0, curMin = 0, curMax = 0, maxSum = nums[0], minSum = nums[0];
for(int a: nums){
curMin = Math.min(curMin + a, a);
curMax = Math.max(curMax + a, a);
maxSum = Math.max(maxSum, curMax);
minSum = Math.min(minSum, curMin);
total += a;
}
return maxSum > 0 ? Math.max(total - minSum, maxSum) : maxSum;
```