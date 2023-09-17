class Solution {
    public int shortestPathLength(int[][] graph) {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        int n = graph.length;
        for(int i = 0; i < n; i++){
                        if(!hm.containsKey(i)){
                hm.put(i, new ArrayList<Integer>());
            }
            
            int m = graph[i].length;
            for(int j=0;j<m;j++){
                hm.get(i).add(graph[i][j]);
            }
        }
        int row = (int)Math.pow(2,n);
        int col = n;
        int dist[][] = new int[row][col];
        
        for(int i=0;i<row;i++){
            Arrays.fill(dist[i], -1);
        }
        
        LinkedList<int[]> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            
            int lead = i;
            int mask = setbit(0,i);
            
            q.add(new int[]{lead, mask});
            dist[mask][lead] = 0;
        }
        
        while(q.size() > 0){
            int size = q.size();
            for(int i=0;i<size;i++){
                
                int[] path = q.remove();
                
                int lead = path[0];
                int mask = path[1];
                
                if(mask == row-1){   //all nodes visited
                    return dist[mask][lead];
                }
                
                // iterate over neighbours of lead
                if(hm.containsKey(lead)){
                    
                    for(int child: hm.get(lead)){
                    
                        int newlead = child;
                        int newmask = setbit(mask, newlead);

                        // avoid cycle: intelligent bfs : checking if this set is already visited 
                        // set : lead, mask(visited nodes)
                        if(dist[newmask][newlead]!=-1){
                            continue;
                        }

                        dist[newmask][newlead] = dist[mask][lead]+1;
                        q.add(new int[]{newlead, newmask});

                    }

                }
                
            }
        }
        return 0;
    }
    
    private int setbit(int mask, int i){
        return mask | (1 << i);
    }
}