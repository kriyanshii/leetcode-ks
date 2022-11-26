class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] dp = new int[arr.length + 1];
        int res = 0, M = (int)1e9 + 7;
        stack.push(-1);
        
        for(int i = 0; i < arr.length; i++){
            while(stack.peek() != -1 && arr[i] <= arr[stack.peek()]){
                stack.pop();
            }
            dp[i + 1] = dp[stack.peek() + 1] + ((i - stack.peek()) * arr[i]) % M;
            stack.push(i);
            res += dp[i + 1];
            res %= M;
        }
        return res;
    }
}