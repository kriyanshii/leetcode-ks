class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        // TreeMap<Integer, Integer> win = new TreeMap<>();
        TreeMap<Integer, Integer> lose = new TreeMap<>();
        for(int[] match: matches){
            lose.put(match[0], lose.getOrDefault(match[0], 0));
            lose.put(match[1], lose.getOrDefault(match[1], 0) + 1);
        }
        List<List<Integer>> list = Arrays.asList(new ArrayList<>(), new ArrayList<>());
        for(int key: lose.keySet()){
            if(lose.get(key) <= 1){
                list.get(lose.get(key)).add(key);
            }
        }
        return list;
    }
}