class Solution {
    public int nthUglyNumber(int n) {
        TreeSet<Long> set = new TreeSet<>();
        set.add(1L);
        for(int i = 1;  i < n; i++){
            long temp = set.pollFirst();
            set.add(temp * 2);
            set.add(temp * 3);
            set.add(temp * 5);
        }
        return set.first().intValue();
    }
}