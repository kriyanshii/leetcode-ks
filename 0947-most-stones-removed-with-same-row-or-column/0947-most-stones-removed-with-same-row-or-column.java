class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    int isLand = 0;

    public int removeStones(int[][] stones) {
        for(int i = 0; i < stones.length; i++){
            union(stones[i][0], ~stones[i][1]);
            System.out.println(~stones[i][1]);
        }
        return stones.length - isLand;
    }

    public int find(int x) {
        if(map.putIfAbsent(x,x) == null){
            isLand++;
        }
        if(x != map.get(x)){
            map.put(x, find(map.get(x)));
        }
        return map.get(x);
    }

    public void union(int x, int y) {
        x = find(x);
        y = find(y);
        if(x != y){
            map.put(x, y);
            isLand--;
        }
    }
}