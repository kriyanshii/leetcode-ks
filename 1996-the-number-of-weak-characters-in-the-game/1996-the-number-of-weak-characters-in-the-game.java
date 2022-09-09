class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        int res = 0, max = 0;
        Arrays.sort(properties,(a, b) -> (a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]));
        for(int[] property: properties){
            if(property[1] < max){
                res++;
            }
            max = Math.max(max, property[1]);
        }
        return res;
    }
}