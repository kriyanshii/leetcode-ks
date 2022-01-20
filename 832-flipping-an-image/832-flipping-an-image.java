class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image[0].length;
         for(int[] row: image){
            for(int i=0; i<(n+1)/2; i++){
                int tmp = row[i] ^ 1;
                row[i] = row[n - i -1] ^ 1;
                row[n - i -1] = tmp;
            }
         }
        return image;
    }
}