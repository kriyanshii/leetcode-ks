class Solution {
    public int minimumCardPickup(int[] cards) {
        int res = Integer.MAX_VALUE, i = 0, j = 0;
        HashSet<Integer> set = new HashSet<>();
        while(j < cards.length){
            if(!set.contains(cards[j])){
                set.add(cards[j++]);
            }else{
                res = Math.min(set.size() + 1, res);
                set.remove(cards[i++]);
            }
        }
        if(set.size() == cards.length) return -1;
        return res;
    }
}