class Solution {
    public int minGroups(int[][] intervals) {
        int[] count = new int[1000002];
        for(int[] i: intervals){
            count[i[0]]++;
            count[i[1] + 1]--;
        }
        int max = 0;
        for(int i = 1; i < 1000002; i++){
            count[i] += count[i - 1];
            max = Math.max(count[i], max);
        }
        return max;
    }
}