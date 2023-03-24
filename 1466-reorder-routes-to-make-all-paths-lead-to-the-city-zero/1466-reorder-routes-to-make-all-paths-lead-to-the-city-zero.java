class Solution {
    public int minReorder(int n, int[][] connections) {
        Set<String> set = new HashSet<>();
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for(int[] c: connections){
            set.add(c[0] + "," + c[1]);
            map.computeIfAbsent(c[0], k -> new HashSet<>());
            map.computeIfAbsent(c[1], k -> new HashSet<>());
            map.get(c[0]).add(c[1]);
            map.get(c[1]).add(c[0]);
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        int res = 0;
        boolean[] visited = new boolean[n];
        visited[0] = true;
        while(!q.isEmpty()){
            int c = q.poll();
            for(int next: map.getOrDefault(c, new HashSet<>())){
                if(visited[next]) continue;
                visited[next] = true;
                if(!set.contains(next + "," + c)) res++;
                q.offer(next);
            }
        }
        return res;
    }
}