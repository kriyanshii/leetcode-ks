class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0, sum = 0;
        int n = gain.length;
        for(int point: gain){
            sum += point;
            if(max < sum){
                max = sum;
            }
        }
        return max;
    }
}