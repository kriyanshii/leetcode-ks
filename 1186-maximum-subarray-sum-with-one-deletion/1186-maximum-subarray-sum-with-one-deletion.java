class Solution {
    public int maximumSum(int[] arr) {
        if(arr.length == 1) return arr[0];
        int n = arr.length;
        
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        
        int max = arr[0];
        dp1[0] = arr[0];
        dp2[n - 1] = arr[n - 1];
        
        for(int i = 1; i < n; i++){
            dp1[i] = dp1[i - 1] > 0 ? dp1[i - 1] + arr[i] : arr[i];
            max = Math.max(dp1[i], max);
            // System.out.println(dp1[i]);
        }
        
        for(int i = n - 2; i >= 0; i--){
            dp2[i] = dp2[i + 1] > 0 ? dp2[i + 1] + arr[i] : arr[i];
        }
        
        for(int i = 1; i < n-1; i++){
            if(arr[i] < 0){
                max = Math.max(dp1[i - 1] + dp2[i + 1], max);
                // System.out.println(dp1[i - 1] + dp2[i + 1]);
            }
        }
        return max;
     }
}