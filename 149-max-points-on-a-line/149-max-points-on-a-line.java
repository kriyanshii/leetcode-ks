class Solution {
    public int maxPoints(int[][] points) {
        //corner case
        if(points == null || points.length == 0){
            return 0;
        }
        //key: slope(dy/dx), value: freq
        Map<List<Integer>, Integer> map = new HashMap<>();
        int res = 0;
        
        int m = points.length;
        for(int i = 0; i < m; i++){
            int sameCount = 0;
            int max = 0;
            for(int j = i + 1; j < m; j++){
                int dy = points[j][1] - points[i][1];
                int dx = points[j][0] - points[i][0];
                if(dx == 0 && dy == 0){
                    sameCount++;
                }
                else{
                    List<Integer> slope = getSlope(dy, dx);
                    map.put(slope, map.getOrDefault(slope, 0) + 1);
                    max = Math.max(max, map.get(slope));
                }
            }
            res = Math.max(res, sameCount + max + 1);
            map.clear();
        }
        return res;
    }
    
    public List<Integer> getSlope(int dy, int dx){
        if(dx == 0) return Arrays.asList(1, 0);
        if(dy == 0) return Arrays.asList(0, 1);
        int d = gcd(dy, dx);
        return Arrays.asList(dy/d, dx/d);
    }
    
    public int gcd(int m, int n){
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}