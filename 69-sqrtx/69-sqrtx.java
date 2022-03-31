class Solution {
    public int mySqrt(int x) {
        if(x==0|| x==1){
            return x;
        }
        int start = 0;
        int end = x/2;
        while(start<end){
            int mid = (start + (end - start)/2) + 1;
            int div = x/mid;
            if(mid == div){
                return mid;
            }else if(mid > div){
                end = mid - 1;
            }else{
                start = mid;
            }
        }
        return start;
    }
}