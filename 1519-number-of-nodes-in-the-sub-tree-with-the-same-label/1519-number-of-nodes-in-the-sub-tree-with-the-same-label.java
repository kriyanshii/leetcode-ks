class Solution {
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int[] edge: edges){
            graph.computeIfAbsent(edge[0], l -> new ArrayList<>()).add(edge[1]);
            graph.computeIfAbsent(edge[1], l -> new ArrayList<>()).add(edge[0]);
        }
        int[] ans = new int[n];
        Set<Integer> seen = new HashSet<>();
        dfs(graph, 0, labels, ans, seen);
        return ans;
    }
    
    private int[] dfs(Map<Integer, List<Integer>> g, int node, String labels, int[] ans, Set<Integer> seen){
        int[] cnt = new int[26];
        if(seen.add(node)){
            char c = labels.charAt(node);
            for(int child: g.getOrDefault(node, Collections.emptyList())){
                int[] sub = dfs(g, child, labels, ans, seen);
                for(int i = 0; i < 26; i++){
                    cnt[i] += sub[i];
                }
            }
            ++cnt[c - 'a'];
            ans[node] = cnt[c - 'a'];
        }
        return cnt;
    }
}