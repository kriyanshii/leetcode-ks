class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            // System.out.println(set.add(i));
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}