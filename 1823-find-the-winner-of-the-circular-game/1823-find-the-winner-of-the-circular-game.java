class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            q.offer(i);
        }
        while(q.size() > 1){
            // int delete = k - 1;
            for(int i = 1; i < k; i++){
                q.offer(q.remove());
            }
            q.remove();
        }
        return q.remove();
    }
}