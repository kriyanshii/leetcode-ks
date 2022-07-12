class Solution {
    public boolean makesquare(int[] matchsticks) {
        if(matchsticks == null || matchsticks.length < 4){
            return false;
        }
        int sum = 0;
        for(int m: matchsticks){
            sum += m;
        }
        if(sum % 4 != 0) return false;
        
        Arrays.sort(matchsticks);
        reverse(matchsticks);
        return dfs(matchsticks, new int[4], 0, sum/4);
    }
    
    public boolean dfs(int[] nums, int[] sums, int index, int target){
        if(index == nums.length){
            if(sums[0] == target &&  sums[1] == target && sums[2] == target){
                return true;
            }
            return false;
        }
        
        for(int i = 0; i < 4; i++){
            if(sums[i] + nums[index] > target) continue;
            sums[i] += nums[index];
            if(dfs(nums, sums, index + 1, target)) return true;
            sums[i] -= nums[index];
        }
        return false;
    }
    
    public void reverse(int[] nums){
        int i = 0, j = nums.length - 1;
        while(i < j){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }
}