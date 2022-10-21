Set<Integer> set = new HashSet<Integer>();
for(int i = 0; i < nums.length; i++){
if(i > k) set.remove(nums[i-k-1]);
if(!set.add(nums[i])) return true;
}
return false;