class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1)
            return intervals;
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        int[] newInterval = intervals[0];
        result.add(newInterval);
        for(int[] slot: intervals){
            if(slot[0] <= newInterval[1]){
                newInterval[1] = Math.max(slot[1], newInterval[1]);
            }else{
                newInterval = slot;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}