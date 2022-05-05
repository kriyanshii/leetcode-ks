class Solution {
    public int mySqrt(int x) {
        if(x<=1) return x;
        int start = 1, end = x/2, ans = 0;
        while(start <= end){
            long mid = start + (end - start)/2;
            if(mid * mid == x){
                return (int)mid;
            }
            if (mid*mid == x)
                return (int)mid;

            // Since we need floor, we update answer when mid*mid is
            // smaller than x, and move closer to sqrt(x)
            if (mid*mid < x)
            {
                start = (int)mid + 1;
                ans = (int)mid;
            }
            else   // If mid*mid is greater than x
                end = (int)mid-1;
        }
        return (int)ans;
    }
}