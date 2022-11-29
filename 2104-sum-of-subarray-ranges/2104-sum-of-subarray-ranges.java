class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long res = 0;
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i <= n; i++){
            //elliminate mins;
            //substract them from res;
            while(!s.isEmpty() && nums[s.peek()] > (i == n ? Integer.MIN_VALUE :nums[i])){
                int j = s.pop();
                int k = s.isEmpty() ? -1 : s.peek();
                res -= (long) nums[j] * (i - j) * (j - k);
            }
            s.push(i);
        }
        
        s.clear();
        for(int i = 0; i <= n; i++){
            //elliminate mins;
            //substract them from res;
            while(!s.isEmpty() && nums[s.peek()] < (i == n ? Integer.MAX_VALUE :nums[i])){
                int j = s.pop();
                int k = s.isEmpty() ? -1 : s.peek();
                res += (long) nums[j] * (i - j) * (j - k);
            }
            s.push(i);
        }
        return res;
    }
}