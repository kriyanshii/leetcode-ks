class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for(int i = 0; i < edges.length; i++){
            int a = edges[i][0], b = edges[i][1];
            graph.computeIfAbsent(a, l -> new ArrayList<>()).add(new int[]{b, i});
            graph.computeIfAbsent(b, l -> new ArrayList<>()).add(new int[]{a, i});
        }
        double[] p = new double[n];
        p[start] = 1;
        Queue<Integer> q = new LinkedList<>(Arrays.asList(start));
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int[] a: graph.getOrDefault(curr, Collections.emptyList())){
                int neighbor = a[0], index = a[1];
                if(p[curr] * succProb[index] > p[neighbor]){
                    p[neighbor] = succProb[index] * p[curr];
                    q.offer(neighbor);
                }
            }
        }
        return p[end];
    }
}