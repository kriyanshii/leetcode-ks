class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            int curGCD = nums[i];
            if(curGCD == k) ans++;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < k) break;
                curGCD = gcd(nums[j], curGCD);
                if(curGCD == k) ans++;
            }
        }
        return ans;
    }
    
    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}