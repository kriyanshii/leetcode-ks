class Solution {
    public int heightChecker(int[] heights) {
        int[] heightFreq = new int[101];
        for(int height : heights){
            heightFreq[height]++;
        }
        int result = 0, currHeight = 0;
        for(int i=0; i<heights.length; i++){
            while(heightFreq[currHeight] == 0){
                currHeight++;
            }
            if(currHeight != heights[i]){
                result++;
            }
            heightFreq[currHeight]--;
        }
        return result;
    }
}