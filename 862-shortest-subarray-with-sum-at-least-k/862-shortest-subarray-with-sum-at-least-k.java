class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int len = nums.length, res = len + 1;
        long[] preSum = new long[len + 1];
        for(int i = 0; i < len; i++){
            preSum[i + 1] += preSum[i] + nums[i];
        }
        Deque<Integer> d = new ArrayDeque<>();
        for(int i = 0; i < len + 1; i++){
            while(d.size() > 0 && preSum[i] - preSum[d.getFirst()] >= k){
                res = Math.min(res, i - d.pollFirst());
            }
            while(d.size() > 0 && preSum[i] <= preSum[d.getLast()]){
                d.pollLast();
            }
            d.addLast(i);
        }
        return res <= len ? res : -1;
    }
}