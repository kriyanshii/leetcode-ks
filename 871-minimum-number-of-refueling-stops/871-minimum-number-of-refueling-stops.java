class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        if(startFuel >= target) return 0; 
        PriorityQueue <Integer> pq = new PriorityQueue<>((a,b) -> (b-a));
        int n = stations.length, i = 0, maxDist = startFuel, stops = 0;
        while(maxDist < target){
            while(i < n && stations[i][0] <= maxDist){
                  pq.offer(stations[i++][1]);
            }
            
            if(pq.isEmpty()) return -1;
            maxDist += pq.poll();
            stops++;
        }
        return stops;
    }
}