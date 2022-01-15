class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image[0].length;
         for(int[] row: image){
            for (int i = 0; i < (n + 1) / 2; ++i) {
                int tmp = row[i] ^ 1; // complementing the ith in tmp
                row[i] = row[n -i - 1] ^ 1; // swaping comlemented version of ith element to n- i -1 place
                row[n - 1 - i] = tmp; // copying tmp to the c
            } 
         }
        return image;
    }
}