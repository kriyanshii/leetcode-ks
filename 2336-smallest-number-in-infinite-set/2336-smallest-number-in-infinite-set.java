class SmallestInfiniteSet {
    int[] arr;
    int min = 1;
    public SmallestInfiniteSet() {
        arr = new int[1001];
    }
    
    public int popSmallest() {
        int j = min;
        for(int i = min + 1; i < 1001; i++){
            if(arr[i] == 0){
                min = i;
                break;
            }
        }
        arr[j] = -1;
        return j;
    }
    
    public void addBack(int num) {
        if(num < min){
            min = num;
        }
        arr[num] = 0;
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */