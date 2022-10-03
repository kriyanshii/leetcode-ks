https://leetcode.com/problems/counting-bits/discuss/1808002/A-very-very-EASY-to-go-EXPLANATION
​
if(n == 0) return 0;
if(n == 1) return 1;
if(memo[n] != 0) return memo[n];
//if memo[n] does not exist then count
if(n % 2 == 0){
memo[n] = solve(n/2, memo);
return solve(n/2, memo);
}else{
memo[n] = 1 + solve(n/2, memo);
return 1 + solve(n/2, memo);
}