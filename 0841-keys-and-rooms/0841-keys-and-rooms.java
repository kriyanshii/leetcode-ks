class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> dfs = new Stack<>();
        HashSet<Integer> seen = new HashSet<>();
        dfs.add(0);
        seen.add(0);
        while(!dfs.isEmpty()){
            int j = dfs.pop();
            for(int i: rooms.get(j)){
                if(!seen.contains(i)){
                    dfs.add(i);
                    seen.add(i);
                    if(rooms.size() == seen.size()) return true;
                }
            }
        }
        return rooms.size() == seen.size();
    }
}