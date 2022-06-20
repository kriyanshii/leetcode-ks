class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        Set<Integer> set = new HashSet<>();
        for(int i: aliceSizes){
            sumA += i;
        }
        for(int i: bobSizes){
            sumB += i;
        }
        int diff = (sumA - sumB) / 2;
        for(int i: aliceSizes){
            set.add(i);
        }
        for(int b : bobSizes){
            if(set.contains(b + diff)){
                return new int[] {b + diff, b};
            }
        }
        return new int[0];
    }
}