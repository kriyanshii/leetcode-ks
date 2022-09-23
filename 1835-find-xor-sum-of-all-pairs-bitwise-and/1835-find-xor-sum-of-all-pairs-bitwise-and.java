class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int xorA = 0, xorB = 0;
        for(int i: arr1){
            xorA ^= i;
        }
        for(int i: arr2){
            xorB ^= i;
        }
        return xorA & xorB;
    }
}