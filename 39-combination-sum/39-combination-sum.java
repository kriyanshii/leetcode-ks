class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0, target);
        return list;
    }
    
    public void backtrack(List<List<Integer>> list, List<Integer> tmp, int[] nums, int start, int remain){
        if(remain < 0) return;
        else if(remain == 0) list.add(new ArrayList<>(tmp));
        else{
            for(int i = start; i < nums.length; i++){
                tmp.add(nums[i]);
                backtrack(list, tmp, nums, i, remain - nums[i]);
                tmp.remove(tmp.size() - 1);
            }
        }
    }
}