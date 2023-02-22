class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;
        for(int i: weights){
            left = Math.max(i, left);
            right += i;
        }
        while(left < right){
            int mid = (left + right) / 2, need = 1, cur = 0;
            for(int i: weights){
                if(cur + i > mid){
                    need++;
                    cur = 0;
                }
                cur += i;
            }
            if(need > days) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}