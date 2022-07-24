class NumberContainers {
    Map<Integer, TreeSet<Integer>> treeMap;
    Map<Integer, Integer> map;
    
    public NumberContainers() {
        treeMap = new HashMap<>();
        map = new HashMap<>();
    }
    
    public void change(int index, int number) {
        map.put(index, number);
        if(!treeMap.containsKey(number)) treeMap.put(number, new TreeSet<>());
        treeMap.get(number).add(index);
    }
    
    public int find(int number) {
        if(!treeMap.containsKey(number)) return -1;
        for(Integer a: treeMap.get(number)){
            if(map.get(a) == number) return a;
        }
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */