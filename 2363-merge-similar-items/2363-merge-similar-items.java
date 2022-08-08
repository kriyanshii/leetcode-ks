class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int[] item: items1){
            map.merge(item[0], item[1], Integer:: sum);
        }
        for(int[] item: items2){
            map.merge(item[0], item[1], Integer:: sum);
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        for(var e: map.entrySet()){
            ans.add(Arrays.asList(e.getKey(), e.getValue()));
        }
        return ans;
    }
}