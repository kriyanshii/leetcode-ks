class Solution {
    public String[] findRelativeRanks(int[] score) {
        Integer[] index = new Integer[score.length];
        
        for(int i = 0; i < score.length; i++){
            index[i] = i;
        }
        
        Arrays.sort(index, (a, b) -> (score[b] - score[a]));
        
        String[] ans = new String[score.length];
        
        for(int i = 0; i < score.length; i++){
            if(i == 0){
                ans[index[i]] = "Gold Medal";
            }else if(i == 1){
                ans[index[i]] = "Silver Medal";
            }else if(i == 2){
                ans[index[i]] = "Bronze Medal";
            }else{
                ans[index[i]] = (i+1) + "";
            }
        }
        return ans;
    }
}