class Solution {
    public int shortestBridge(int[][] grid) {
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Queue<int[]> q = new LinkedList<>();
        boolean found = false;
        for(int i = 0; i < n; i++){
            if(found){
                break;
            }
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    dfs(grid, visited, q, i, j, dirs);
                    found = true;
                    break;
                }
            }
        }
//         bfs to expand this island
        int step = 0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                int[] cur = q.poll();
                for(int[] dir: dirs){
                    int i = cur[0] + dir[0];
                    int j = cur[1] + dir[1];
                    if(i >= 0 && j >= 0 && i < n && j < n && !visited[i][j]){
                        if(grid[i][j] == 1){
                            return step;
                        }
                        q.offer(new int[]{i, j});
                        visited[i][j] = true;
                    }
                }
            }
            step++;
        }
        return -1;
    }
    
    public void dfs(int[][] grid, boolean[][] visited, Queue<int[]> q, int i, int j, int[][] dirs){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visited[i][j]  || grid[i][j] == 0){
            return;
        }
        visited[i][j] = true;
        q.offer(new int[]{i, j});
        for(int[] dir: dirs){
            dfs(grid, visited, q, i + dir[0], j + dir[1], dirs);
        }
    }
}