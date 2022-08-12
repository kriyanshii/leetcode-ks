class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
        return list;
    }
    
    public void backtrack(List<List<Integer>> list, ArrayList<Integer> tmp,int[] nums, boolean[] used){
        if(tmp.size() == nums.length){
            list.add(new ArrayList<>(tmp));
        }else{
            for(int i = 0; i < nums.length; i++){
                if(used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
                used[i] = true;
                tmp.add(nums[i]);
                backtrack(list, tmp, nums, used);
                used[i] = false;
                tmp.remove(tmp.size() - 1);
            }
        }
    }
}