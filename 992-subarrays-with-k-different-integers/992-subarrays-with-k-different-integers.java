class Solution {
    public int subarraysWithKDistinct(int[] A, int K) {
        int nvals[] = new int[A.length + 1];
        int nsub = 1;
        int l = 0;
        int r = 0;
        int totalsub = 0;
        while (r < A.length) {
            if (nvals[A[r++]]++ == 0) {
                K--;
            }
            if (K < 0) {
                --nvals[A[l++]];
                K++;
                nsub = 1;
            }
            if (K == 0) {
                while (nvals[A[l]] > 1) {
                    --nvals[A[l++]];
                    nsub++;
                }
                totalsub += nsub;
            }
        }
        return totalsub;
    }
}