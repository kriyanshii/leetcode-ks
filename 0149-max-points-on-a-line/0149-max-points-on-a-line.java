class Solution {
    public int maxPoints(int[][] points) {
        if(points == null) return 0;
        if(points.length <= 2) return points.length;
        // Map<String, Integer> map = new HashMap<>();
        int result = 2;
        for(int i = 0; i < points.length; i++){
            for(int j = i + 1; j < points.length; j++){
                int temp = 2;
                for(int k = j+1 ; k<points.length; k++ ){                   
                    int x = (points[j][1] - points[i][1]) * (points[k][0] - points[i][0]);
                    int y = (points[k][1] - points[i][1]) * (points[j][0] - points[i][0]);
                    if(x == y){
                        temp++;
                    }
                }
                if(temp > result){
                    result = temp;
                }
            }        
        }
        return result;
    }
}