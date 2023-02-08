https://leetcode.com/problems/jump-game-ii/discuss/18014/Concise-O(n)-one-loop-JAVA-solution-based-on-Greedy
```
int curEnd = 0, curFarthest = 0;
int jump = 0;
for(int i = 0; i < nums.length - 1; i++){
curFarthest = Math.max(i + nums[i], curFarthest);
if(curEnd == i){
curEnd = curFarthest;
jump++;
if(curEnd>=nums.length-1)return jump;
}
}
return jump;
```
​
​