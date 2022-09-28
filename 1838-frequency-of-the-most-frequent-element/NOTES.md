int res = 1, i = 0;
long sum = 0;
Arrays.sort(nums);
for(int j = 0; j < nums.length; j++){
sum += nums[j];
while(sum + k < (long)nums[j] * (j - i + 1)){
sum -= nums[i++];
}
res = Math.max(res, j - i + 1);
}
return res;