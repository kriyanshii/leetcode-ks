class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] ans = new int[nums.length];
        int n = nums.length;
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        
        for(int  i = 0; i < n; i++){
            if(i % 2 == 0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }
        
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);
        int j = 0;
        int k = 0;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                ans[i] = even.get(j++);
            }else{
                ans[i] = odd.get(k++);
            }
        }
        return ans;
    }
}