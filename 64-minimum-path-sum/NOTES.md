public int minPathSum(int[][] grid) {
int m=grid.length;
int n=grid[0].length;
int[][] dp=new int[m][n];
for(int[] i:dp){
Arrays.fill(i,-1);
}
return minCost(m-1,n-1,grid,dp);
}
public int minCost(int i,int j,int[][] grid, int[][]dp){
if(i==0 && j==0){
return grid[0][0];
}
if(i<0 || j <0 ) {return 10000;}
if(dp[i][j]!=-1){
return dp[i][j];
}
int left=minCost(i,j-1,grid,dp);
int up=minCost(i-1,j,grid,dp);
return dp[i][j]=Math.min(left,up)+grid[i][j];
}