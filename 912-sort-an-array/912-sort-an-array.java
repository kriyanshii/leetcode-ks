class Solution {
    public int[] sortArray(int[] nums) {
        int len = nums.length;
        PriorityQueue <Integer> heap = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            heap.add(nums[i]);
        }
        int i = 0;
        while(!heap.isEmpty()){
            nums[i++] = heap.poll();
        }
        return nums;
    }
}