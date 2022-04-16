class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> flag = new HashSet<Integer>();
        for(int i : nums){
            if(!flag.add(i)){
                return true;
            }
        }
        return false;
    }
}