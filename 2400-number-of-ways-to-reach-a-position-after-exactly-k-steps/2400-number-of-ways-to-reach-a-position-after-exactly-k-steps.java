class Solution {
    int p = 1000000007;
    public int numberOfWays(int s, int e, int k) {
        if((s - e - k )% 2 != 0) return 0;
        if(Math.abs(s - e) > k) return 0;
        long res = 1L;
        for(int i = 0; i < (e - s + k)/2; i++){
            res = res * (k - i) % p;
            // System.out.println("res " + res);
            res = res * inv(i + 1) % p;
            // System.out.println("res " + res);
        }
        return (int)res;
    }
    
    public long inv(long a){
        if(a == 1) return 1;
        // System.out.println((p - p / a) * inv(p % a) % p);
        return (p - p / a) * inv(p % a) % p;
    }
}