class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 0; i < manager.length; i++){
            int j = manager[i];
            if(!graph.containsKey(j)){
                graph.put(j, new ArrayList<>());
            }
            graph.get(j).add(i);
        }
        return dfs(graph, informTime, headID);
    }
    
    public int dfs(Map<Integer, List<Integer>> graph, int[] informationTime, int cur){
        int max = 0;
        if(!graph.containsKey(cur)){
            return max;
        }
        for(int i = 0; i < graph.get(cur).size(); i++){
            max = Math.max(max, dfs(graph, informationTime, graph.get(cur).get(i)));
        }
        return max + informationTime[cur];
    }
}