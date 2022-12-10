class Solution {
    public int minimizeXor(int num1, int num2) {
        int res = num1, a = Integer.bitCount(num1), b = Integer.bitCount(num2);
        for(int i = 0; i < 32; i++){
            if(a > b && (res & (1 << i)) > 0){
                res ^= 1 << i;
                a--;
            }
            if(a < b && (res & (1 << i)) == 0){
                res ^= 1 << i;
                a++;
            }
            if(a == b) return res;
        }
        return res;
    }
}