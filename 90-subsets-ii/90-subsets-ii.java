class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }
    
    public void backtrack(List<List<Integer>> list, List<Integer> tmp, int[] nums, int start){
        list.add(new ArrayList<>(tmp));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i - 1]) continue;
            tmp.add(nums[i]);
            backtrack(list, tmp, nums, i + 1);
            tmp.remove(tmp.size() - 1);
        }
    }
}