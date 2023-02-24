class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //minus so that the elements are stored in ascending order. brilliant! 
        int n = nums.length, min = Integer.MAX_VALUE, res = Integer.MAX_VALUE;
        for(int a: nums){
            if(a % 2 == 1) a *= 2;
            pq.add(-a);
            min = Math.min(min, a);
        }
        while(true){
            int a = -pq.poll();
            // System.out.println(a);
            res = Math.min(res, a - min);
            if(a % 2 == 1) break;
            min = Math.min(min, a/2);
            pq.add(-a/2);
        }
        return res;
    }
}