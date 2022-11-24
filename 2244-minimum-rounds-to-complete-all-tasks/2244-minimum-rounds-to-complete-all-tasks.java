class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int task: tasks){
            map.put(task, map.getOrDefault(task, 0) + 1);
        }
        int res = 0;
        for(int value: map.values()){
            if(value == 1) return -1;
            res += (value + 2)/3;
        }
        return res;
    }
}