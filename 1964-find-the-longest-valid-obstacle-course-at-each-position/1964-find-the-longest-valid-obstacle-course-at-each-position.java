class Solution {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int n = obstacles.length, len = 0, res[] = new int[n], mono[] = new int[n];
        for(int i = 0; i < n; i++){
            int l = 0, r = len;
            while(l <  r){
                int m = (l + r)/2;
                if (mono[m] <= obstacles[i])
                    l = m + 1;
                else
                    r = m;
            }
            res[i] = l + 1;
            if (len == l)
                len++;
            mono[l] = obstacles[i];
        }
        return res;
    }
}