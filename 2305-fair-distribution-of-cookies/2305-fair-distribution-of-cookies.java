class Solution {
    int ans = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        countUnfainess(cookies, 0, k, new int[k]);
        return ans;
    }
    
    public void countUnfainess(int[] cookies, int start, int k, int[] tmp){
        if(start == cookies.length){
            int max = 0;
            for(int c: tmp){
                max = Math.max(max, c);
            }
            ans = Math.min(ans, max);
            return;
        }
        for(int i = 0; i < k; i++){
            tmp[i] += cookies[start];
            countUnfainess(cookies, start + 1, k, tmp);
            tmp[i]-= cookies[start];
        }

    }
}