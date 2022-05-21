https://leetcode.com/problems/coin-change/discuss/77368/*Java*-Both-iterative-and-recursive-solutions-with-explanations
This is the same coin change problem I have done in the subject.
​
​
public int coinChange(int[] coins, int amount) {
if(amount < 1) return 0;
return helper(coins, amount, new int[amount]);
}
private int helper(int[] coins, int rem, int[] count){
if(rem < 0) return -1;
if(rem == 0) return 0;
if(count[rem - 1] != 0) return count[rem -1];
int min = Integer.MIN_VALUE;
for(int coin : coins){
}
}