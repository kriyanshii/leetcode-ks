class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> res = new HashSet<>(), cur1 = new HashSet<>(), cur2;
        for(int i: arr){
            cur2 = new HashSet<>();
            cur2.add(i);
            // System.out.println(i);
            for(int j: cur1){
                cur2.add(i|j);
                // System.out.println(i + " " + j);
                // System.out.println(i|j);
            }
            res.addAll(cur1 = cur2);
        }
        return res.size();
    }
}