class SmallestInfiniteSet {
    SortedSet<Integer> s = new TreeSet<>();

    public SmallestInfiniteSet() {
        for(int i = 1; i < 1001; i++){
            s.add(i);
        }
    }
    
    public int popSmallest() {
        int k = s.first();
        s.remove(k);
        return k;
    }
    
    public void addBack(int num) {
        s.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */