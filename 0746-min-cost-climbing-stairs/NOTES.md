https://leetcode.com/problems/min-cost-climbing-stairs/discuss/476388/4-ways-or-Step-by-step-from-Recursion-greater-top-down-DP-greater-bottom-up-DP-greater-fine-tuning
​
same as fibonacci, climbing stairs.
Just have to take min of them to go to next step!
​
int first = cost[0];
int second = cost[1];
if(cost.length <= 2){
return Math.min(first, second);
}
for(int i = 2; i < cost.length; i++){
int curr = cost[i] + Math.min(first, second);
first = second;
second = curr;
}
return Math.min(first, second);