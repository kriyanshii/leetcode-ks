class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            int curr = groupSizes[i];
            List tmp = new ArrayList<>();
            if(map.containsKey(curr)) tmp = map.get(curr);
            tmp.add(i);
            map.put(curr, tmp);
            if(tmp.size() == curr){
                list.add(tmp);
                map.remove(curr);
            }
        }
        return list;
    }
}