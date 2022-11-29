class RandomizedSet {
    ArrayList<Integer> list;
    HashMap<Integer, Integer> map;
    java.util.Random random = new java.util.Random();
    
    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        // if(!set.contains(val)){
        //     return false;
        // }
        if(map.containsKey(val)) return false;
        //to store the location in arraylist;
        map.put(val, list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        //get location
        int location = map.get(val);
        if(location < list.size() - 1){
            int lastone = list.get(list.size() - 1);
            list.set(location, lastone);
            map.put(lastone, location);
        }
        map.remove(val);
        list.remove(list.size() - 1);
        return true;
    }
    
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */