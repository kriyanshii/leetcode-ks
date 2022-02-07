class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set <Integer> set = new HashSet<Integer>();
        for(int i: nums){
            if(i >= original){
                set.add(i);
            }
        }
        while(set.contains(original)){
            original*=2;
        }
        return original;
    }
}