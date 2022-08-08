https://leetcode.com/problems/longest-increasing-subsequence/discuss/74824/JavaPython-Binary-search-O(nlogn)-time-with-explanation
```
int[] tails = new int[nums.length];
int size = 0;
for(int x: nums){
int i = 0, j = size;
while(i != j){
int mid = (i + j) / 2;
if(tails[mid] < x){
i = mid + 1;
}else{
j = mid;
}
}
tails[i] = x;
if(i == size) size++;
}
return size;
```