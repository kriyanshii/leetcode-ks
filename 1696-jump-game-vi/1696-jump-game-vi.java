class Solution {
    public int maxResult(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offer(0);
        for(int i = 1; i < n; i++){
            nums[i] = nums[i] + nums[dq.peekFirst()];
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            
            if(i - dq.peekFirst() >= k){
                dq.pollFirst();
            }
        }
        return nums[n - 1];
    }
}