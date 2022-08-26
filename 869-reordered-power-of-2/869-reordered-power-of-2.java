class Solution {
    public boolean reorderedPowerOf2(int n) {
        long count = counter(n);
        for(int i = 0; i < 32; i++){
            // System.out.println(i << i);
            if(counter (1 << i) == count) return true;
        }
        return false;
    }
    
    public long counter(int N){
        long res = 0;
        for(; N > 0; N /= 10){ 
            res += Math.pow(10, N % 10);
            System.out.println(res);
        }
        return res;
    }
}