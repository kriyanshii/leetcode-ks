class Solution {
    public int minCost(String colors, int[] neededTime) {
        int res = 0, max = 0, sum = 0;
        for(int i = 0; i < colors.length(); i++){
            if(i > 0 && colors.charAt(i) != colors.charAt(i - 1)){
                res += (sum - max);
                max = sum = 0;
            }
            sum += neededTime[i];
            max = Math.max(neededTime[i], max);
        }
        res += sum - max;
        return res;
    }
}