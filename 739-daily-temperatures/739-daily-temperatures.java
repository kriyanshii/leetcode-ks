class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int maxTemp = 0;
        int []res = new int[temp.length];
        
        for(int i = temp.length -1;i>=0;i--){
            int curr = temp[i];
            if(curr >= maxTemp ){
                maxTemp = curr;
                continue;
            }
            
            int days = 1;
            while(temp[i+days] <= curr){
                days+=res[i+days];
            }
            res[i] = days;
        }
        return res;
    }
}