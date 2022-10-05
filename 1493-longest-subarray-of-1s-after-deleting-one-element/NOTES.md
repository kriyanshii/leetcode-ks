for(int j = 0; j < nums.length; j++){
if(nums[j] == 0){
k--;
}
while(k < 0){
if(nums[i] == 0){
k++;
}
i++;
}
res = Math.max(res, j - i);
}
return res;