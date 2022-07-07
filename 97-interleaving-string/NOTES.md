for (int i = 1; i < mat.length; i++){
for (int j = 1; j < mat[0].length; j++){
mat[i][j] = (mat[i-1][j]&&(s2.charAt(i-1)==s3.charAt(i+j-1)))
|| (mat[i][j-1]&&(s1.charAt(j-1)==s3.charAt(i+j-1)));
}
}