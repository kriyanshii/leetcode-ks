https://leetcode.com/problems/sum-of-subarray-minimums/discuss/1787529/Detailed-Explanation-or-Monotonic-stack-solution-or-Java-or-O(n)
​
![](https://assets.leetcode.com/users/images/f39fadc7-4222-4e5b-ac58-c513ea44a898_1631905342.394499.png)
​
​
Proof of multiplication give us the number of sub-arrays
we have an array: A = [2, 9, 7, 8, 3, 4, 6, 1], and we want to find how many subarrays of A has minimum number is 3.
​
Let's assume distance between 3 to 2 (minimum number to first number greater 3 to the left (3 -> 9)) is m.
and distance between 3 to 1 (minimum number to first number greater 3 to the right (3 -> 6)) is n.
​
The number of subarray we have for the array A with length m + n - 1 is 1 + 2 + 3 + 4 + ... + m + n - 1 = Summation(1 + (m + n - 1)), which is equal difference series sum S3 = n (a1 + an) / 2 = (m + n - 1) (m + n - 1 + 1) / 2 = (m + n - 1) (m + n) / 2
​
Since 3 is the minimum number and we need to subtract number of subarrays which exclusive 3, which are subarrays [9,7,8] with length 3 or m - 1 and [4,6] with length 2 or n - 1, number of subarrays for [9,7,8] is S1 = (m - 1 + 1)(m - 1) / 2 = m(m - 1) / 2 and for [4,6] is S2 = n(n - 1) / 2
​
Finally, we have
​
S3 - S2 - S1 = (m + n - 1)(m + n)/2 - m(m - 1)/2 - n(n - 1)/2
= (n^2 + mn - n + mn + m^2 - m - n^2 + n - m^2 + m) / 2
= 2mn / 2
= mn
, which is left distance multiply right distance.
​
Stack<Integer> stack = new Stack<>();
int[] dp = new int[arr.length + 1];
stack.push(-1);
int result = 0, M = (int)1e9 + 7;
for(int i = 0; i < arr.length; i++){
while(stack.peek() != -1 && arr[i] <= arr[stack.peek()]){
stack.pop();
}
dp[i+1] = (dp[stack.peek() + 1] + (i - stack.peek()) * arr[i]) % M;
stack.push(i);
result += dp[i + 1];
result %= M;
}
return result;
​