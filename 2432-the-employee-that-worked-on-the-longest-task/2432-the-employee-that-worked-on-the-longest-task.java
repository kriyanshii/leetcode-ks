class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int max = logs[0][1], id = logs[0][0];
        for(int i = 1; i < logs.length; i++){
            int time = logs[i][1] - logs[i - 1][1];
            if(time > max){
                max = time;
                id = logs[i][0];
            }else if(time == max && id > logs[i][0]){
                max = time;
                id = logs[i][0];
            }
        }
        return id;
    }
}