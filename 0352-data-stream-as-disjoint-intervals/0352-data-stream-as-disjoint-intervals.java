class SummaryRanges {
    TreeMap<Integer, int[]> tree;
    public SummaryRanges() {
        tree = new TreeMap<>();
    }
    
    public void addNum(int val) {
        if(tree.containsKey(val)){
            return;
        }
        Integer lower = tree.lowerKey(val);
        Integer higher = tree.higherKey(val);
        if(lower != null && higher != null && val == tree.get(lower)[1] + 1 && val == tree.get(higher)[0] - 1){
            tree.get(lower)[1] = tree.get(higher)[1];
            tree.remove(higher);
            // System.out.println(lower + " " + higher);
        }
        else if(lower != null && val <= tree.get(lower)[1] + 1){
            tree.get(lower)[1] = Math.max(val, tree.get(lower)[1]);
            // System.out.println(lower + " " + higher);
        }else if(higher != null && val == tree.get(higher)[0] - 1){
            tree.put(val, new int[]{val, tree.get(higher)[1]});
            tree.remove(higher);
            // System.out.println(lower + " " + higher);
        }else{
            tree.put(val, new int[]{val, val});
            // System.out.println(lower + " " + higher);
        }
    }
    
    public int[][] getIntervals() {
        int[][] res = new int[tree.size()][2];
        int i = 0;
        for(int[] a: tree.values()){
            res[i++] = a;
        }
        return res;
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(value);
 * int[][] param_2 = obj.getIntervals();
 */