class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        long left = 1, right = num/2;
        while(left<=right){
            long mid = left + (right - left)/2;
            long res = mid*mid;
            if(res== num){
                return true;
            }else if(res < num){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return false;
    }
}