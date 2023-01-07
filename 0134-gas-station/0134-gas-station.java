class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalC = 0, totalG = 0, pos = 0, total = 0;
        for(int i = 0; i < gas.length; i++){
            totalG += gas[i];
            totalC += cost[i];
        }
        if(totalC > totalG) return -1;
        for(int i = 0; i < gas.length; i++){
            total += gas[i] - cost[i];
            if(total < 0){
                total = 0;
                pos = i + 1;
            }
        }
        return pos;
    }
}