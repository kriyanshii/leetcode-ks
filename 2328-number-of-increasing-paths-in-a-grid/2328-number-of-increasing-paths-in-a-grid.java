class Solution {
    long mod=1000000007;
    long dp[][];
    public int countPaths(int[][] grid) {
        
        int n=grid.length,m=grid[0].length;
        dp=new long[n][m];
        long ans=0;
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){

               ans=(ans+find(i,j,grid))%mod;
               ans=(ans+mod)%mod;
           }
       }
        return (int)(ans%1000000007);
    }
    int dir[][]={{-1,0},{1,0},{0,1},{0,-1}};
     long find(int i,int j,int grid[][]){

        if(dp[i][j]!=0) return dp[i][j];

        long ans=1;
        for(int k=0;k<4;k++){
            int i1=i+dir[k][0],j1=j+dir[k][1];

            if(i1<0 || j1<0 || i1==dp.length || j1==dp[0].length || grid[i][j]<=grid[i1][j1])
             continue;

            ans=(ans+find(i1,j1,grid))%mod;
        }
        ans=(ans+mod)%mod;
        return dp[i][j]=(ans);
    }
}