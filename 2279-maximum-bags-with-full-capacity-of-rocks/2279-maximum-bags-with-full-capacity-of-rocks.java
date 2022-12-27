class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = rocks.length;
        int[] res = new int[n];
        for(int i = 0; i < capacity.length; i++){
            res[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(res);
        int count = 0;
        for(int i = 0; i < res.length; i++){
            if(res[i] <= additionalRocks){
                additionalRocks -= res[i];
                count++;
            }
        }
        return count;
    }
}