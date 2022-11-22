class Solution {
    public int fib(int n) {
        if(n == 0){
            return n;
        }
        int pre1 = 1, pre2 = 0;
        for(int i = 2; i <= n; i++){
            int curr = pre1 + pre2;
            pre2 = pre1;
            pre1 = curr;
        }
        return pre1;
    }
}