class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i: arr){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i) +1);
            }else{
                hm.put(i,1);
            }
        }
        Set<Integer> set = new HashSet();
        for(int i: hm.values()){
            if(set.contains(i)){
                return false;
            }else{
                set.add(i);
            }
        }
        return true;
    }
}