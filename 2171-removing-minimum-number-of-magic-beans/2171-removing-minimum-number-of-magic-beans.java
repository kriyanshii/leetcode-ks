class Solution {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        long sum = 0;
        for(int i: beans){
            sum += i;
        }
        long m = beans.length;
        long result = Long.MAX_VALUE;
        for(int i = 0; i < beans.length; i++, m--){
            result = Math.min(result, sum - (m * beans[i]));
        }
        return result;
    }
}