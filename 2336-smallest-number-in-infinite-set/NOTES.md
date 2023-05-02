int j = min;
for(int i=min+1; i<1001; i++){
if(arr[i] == 0) {
min = i;
break;
}
}
arr[j] = -1;
return j;
if(num<min){
min = num;
// System.out.println(arr[num]);
}
arr[num] = 0;
// System.out.println(arr[num]);
https://leetcode.com/problems/smallest-number-in-infinite-set/discuss/2261300/Full-Explanations-or-C%2B%2B-or-Set-or-Easy-To-Understand-or-also-Java-%2B-Python-code