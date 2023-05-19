https://leetcode.com/problems/delete-and-earn/discuss/109895/JavaC%2B%2B-Clean-Code-with-Explanation
​
in a house robber way.
​
int n = 10001;
int[] values = new int[n];
for(int value: nums){
values[value] += value;
}
int take = 0, skip = 0;
for(int i = 0; i <values.length; i++){
int tmp = take;
take = Math.max(take, skip + values[i]);
skip = tmp;
}
return take;