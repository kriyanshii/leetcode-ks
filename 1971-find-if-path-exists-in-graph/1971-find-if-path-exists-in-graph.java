class Solution {
    boolean found = false;
    public boolean validPath(int n, int[][] edges, int start, int end) {
        if(start == end) return true;
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++){
            graph.put(i, new ArrayList<>());
        }
        for(int[] edge: edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        dfs(graph, visited, start, end);
        return found;
    }

    public void dfs(HashMap<Integer, List<Integer>> graph, boolean[] visited, int start, int end){
        if(visited[start] || found) return;
        visited[start] = true;
        for(int i: graph.get(start)){
            if(i == end){
                found = true;
                break;
            }
            if(visited[i] != true){
                dfs(graph, visited, i, end);
            }
        }
    }
}