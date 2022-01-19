class Solution {
    public int maximumWealth(int[][] accounts) {
        // int[] arr = new int[accounts.length];

        int max = 0;
       for(int[] account: accounts){
           int s = sum(account);
           if(max < s){
               max = s;
           }
       }
        return max;
    }
    
    static int sum(int[] nums){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return sum;
    }
}