class Solution {
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> (b-a));
        long total = 0;
        for(int t: target){
            total += t;
            pq.add(t);
        }
        while(true){
            int a = pq.poll();
            total -= a;
            if(a == 1 || total == 1){
                return true;
            }if(a < total || total == 0 || a % total == 0){
                return false;
            }
            a %= total;
            total += a;
            pq.add(a);
        }
    }
}