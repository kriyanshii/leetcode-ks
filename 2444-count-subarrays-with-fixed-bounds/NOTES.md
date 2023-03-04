long ans = 0;
int mini = 0, maxi = 0, c = 0;
for (int i = 0; i < nums.length; i++) {
if (nums[i] == minK)  mini = i;
if (nums[i] == maxK)  maxi = i;
if (nums[i] < minK || nums[i] > maxK) {
c = i + 1;
mini = i; maxi = i;
}
if (nums[mini] == minK && nums[maxi] == maxK)
ans += Math.min(mini - c, maxi - c) + 1;
}
return ans;