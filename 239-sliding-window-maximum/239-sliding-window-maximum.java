class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length, j = 0;
        int[] ans = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<Integer>();
        for(int i = 0; i < n; i++){
            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) dq.pollLast();
            dq.addLast(i);
            if(i + 1 >= k){
                ans[j++] = nums[dq.peekFirst()];
            }
            if(i - dq.peekFirst() + 1 >= k) dq.removeFirst();
        }
        return ans;
    }
}