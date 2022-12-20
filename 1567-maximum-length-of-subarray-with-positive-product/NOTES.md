int firstNeg = -1, zeroPos = -1, sum = 0, max = 0;
for(int i = 0; i < nums.length; i++){
if(nums[i] < 0){
sum++;
if(firstNeg == -1) firstNeg = i;
}
if(nums[i] == 0){
sum = 0;
firstNeg = -1;
zeroPos = i;
}else{
if(sum % 2 == 0){
max = Math.max(i - zeroPos, max);
}else{
max = Math.max(i -firstNeg, max);
}
}
}
return max;
https://leetcode.com/problems/maximum-length-of-subarray-with-positive-product/discuss/819278/Java-O(n)-time-O(1)-space