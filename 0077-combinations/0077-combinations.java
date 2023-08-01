class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        comb(list, new ArrayList<>(), 1, n, k);
        return list;
    }
    
    public void comb(List<List<Integer>> list, List<Integer> tmp, int start, int n, int k){
        if(k == 0){
            list.add(new ArrayList<>(tmp));
        }else{
            for(int i = start; i <= n; i++){
                tmp.add(i);
                comb(list, tmp, i + 1, n, k - 1);
                tmp.remove(tmp.size() - 1);
            }
        }
    }
}