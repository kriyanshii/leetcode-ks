class Solution {
    public boolean isPowerOfTwo(int n) {
        // x will check if x == 0 and !(x & (x - 1)) will check if x is a power of 2 or not
        return n > 0 & (n & n - 1) == 0;
    }
}