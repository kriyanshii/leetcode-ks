class Solution {
    public int equalPairs(int[][] grid) {
        int res = 0, n = grid.length;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++){
                sb.append(grid[i][j]);
                sb.append(',');
            }
            String curr = sb.toString();
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        for(int i = 0; i < n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++){
                sb.append(grid[j][i]);
                sb.append(',');
            }
            String curr = sb.toString();
            if(map.containsKey(curr)){
                res += map.get(curr);
            }
        }
        return res;
    }
}