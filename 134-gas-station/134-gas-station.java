class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0, costSum = 0, total = 0, pos = 0;
        for(int i: gas){
            gasSum += i;
        }
        for(int i: cost){
            costSum += i;
        }
        if(gasSum < costSum){
            return -1;
        }
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