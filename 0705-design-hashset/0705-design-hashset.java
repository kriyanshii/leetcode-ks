class MyHashSet {
    int[] nums;
    public MyHashSet() {
        // cause 1000000/32 = 31250
        nums = new int[32259];
    }
    
    public void add(int key) {
        nums[getIdx(key)] |= getKey(key);
    }
    
    public void remove(int key) {
        nums[getIdx(key)] &= ~getKey(key);
    }
    
    public boolean contains(int key) {
        return (nums[getIdx(key)] & getKey(key)) != 0;
    }
    
    public int getIdx(int key){
        return key / 31;
    }
    
    public int getKey(int key){
        key %= 32;
        return 1 << key;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */