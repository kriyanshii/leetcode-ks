class Solution {
    public int shortestSequence(int[] rolls, int k) {
        int res = 1;
        Set<Integer> set = new HashSet<>();
        for(int roll: rolls){
            set.add(roll);
            if(set.size() == k){
                res++;
                set.clear();
            }
        }
        return res;
    }
}