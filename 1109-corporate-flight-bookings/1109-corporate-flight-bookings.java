class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n];
        for(int[] booking: bookings){
            int start = booking[0] - 1;
            int end = booking[1];
            int reservation = booking[2];
            res[start] += reservation;
            if(end < n){
                res[end] -= reservation;   
            }
        }
        for(int i = 1; i<n; i++){
            res[i] += res[i - 1];
        }
        return res;
    }
}