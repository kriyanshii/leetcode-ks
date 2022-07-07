class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if((s1.length() + s2.length() != s3.length())) return false;
        boolean[][] mat = new boolean[s2.length() + 1][s1.length() + 1];
        
        mat[0][0] = true;
        
        for(int i = 1; i < mat[0].length; i++){
            mat[0][i] = mat[0][i-1] && (s1.charAt(i - 1) == s3.charAt(i - 1));
        }
        
        for(int i = 1; i < mat.length; i++){
            mat[i][0] = mat[i-1][0] && (s2.charAt(i - 1) == s3.charAt(i - 1));
        }
        
        for(int i = 1; i < mat.length; i++){
            for(int j = 1; j < mat[0].length; j++){
            mat[i][j] = (mat[i-1][j]&&(s2.charAt(i-1)==s3.charAt(i+j-1)))
                    || (mat[i][j-1]&&(s1.charAt(j-1)==s3.charAt(i+j-1)));
            }
        }
        return mat[s2.length()][s1.length()];
    }
}