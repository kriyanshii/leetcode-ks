class Solution {
    int res = 0;
    public int longestPath(int[] parent, String s) {
        ArrayList<Integer>[] list = new ArrayList[parent.length];
        for(int i = 0; i < parent.length; i++){
            list[i] = new ArrayList<>();
        }
        for(int i = 1; i < parent.length; i++){
            list[parent[i]].add(i);
        }
        dfs(list, s, 0);
        return res;
    }
    
    public int dfs(ArrayList<Integer>[] children, String s, int i){
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int j: children[i]){
            int cur = dfs(children, s, j);
            if(s.charAt(i) != s.charAt(j)){
                q.offer(-cur);
            }
        }
        int big1 = q.isEmpty() ? 0 : -q.poll();
        int big2 = q.isEmpty() ? 0 : -q.poll();
        res = Math.max(res, big1 + big2 + 1);
        return big1 + 1;
    }
}