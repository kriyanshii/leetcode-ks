class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long lo = 1, hi = Integer.MAX_VALUE;
        for(int i: time){
            hi = Math.min(hi, i);
        }
        hi *= totalTrips;
        // System.out.println(hi);
        while(lo < hi){
            long mid = lo + (hi - lo)/2;
            if(!helper(mid, totalTrips, time)){
                lo = mid + 1;
            }else{
                hi = mid;
            }
        }
        return lo;
    }
    public boolean helper(long x, int totalTrips, int[] time){
        long sum = 0;
        for(int i: time){
            sum += (x/i);
        }
        return sum >= totalTrips;
    }
}