class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] year = new int[2051];
        for(int[] log: logs){
            year[log[0]]++;
            year[log[1]]--;
        }
        //prefix sum
        for(int i=1950; i<2051;i++){
            year[i] = year[i] + year[i-1];
        }
        //find max from the arr
        int max = 0;
        int maxYear = 1950;
        for(int i=1950;i<2051; i++){
            if(max < year[i]){
                max = year[i];
                maxYear = i;
            }
        }
        return maxYear;
    }
}