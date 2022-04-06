class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int MOD = 1_000_000_007;
        long ans = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            //We'll try to find the number of i < J < k
            // with A[j]  + a[k] == T, where T = target - A[j].
            // The below is a "two sum with multiplicity".
            int T = target - arr[i];
            int j = i+1, k = arr.length - 1;
            while(j < k){
                //steps from typical two sum
                if(arr[j] + arr[k] < T)
                    j++;
                else if(arr[j] + arr[k] > T)
                    k--;
                else if(arr[j] != arr[k]){
                    // so it is arr[j] + arr[k] == T
                    int left = 1, right = 1;
                    while(j+1 < k && arr[j] == arr[j+1]){
                        left++;
                        j++;
                    }
                    while(k-1 > j && arr[k] == arr[k-1]){
                        right++;
                        k--;
                    }
                    
                    ans += left*right;
                    ans %= MOD;
                    j++;
                    k--;
                }else{
                    // M = k - j + 1
                    // we contributer m * (m-1)/2 pairs
                    ans += (k-j+1) * (k - j)/2;
                    ans %= MOD;
                    break;
                }
            }
        }
        
        return (int) ans;
    }
}