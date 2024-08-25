// Grid Path 2

 public int helper(int n,int m,int grid[][],int dp[][])
    {
        if(n==0 && m==0){
            return 1;
        }
        if(n>=0 && m>=0 && grid[n][m]==1)
        {
            return 0;
        }
        if(n<0||m<0){
            return 0;
        }
        if(n>=0 && m>=0 && dp[n][m]!=-1)
        {
            return dp[n][m];
        }
        
        int up=helper(n-1,m,grid,dp) % 1000000007;
        int low=helper(n,m-1,grid,dp)% 1000000007;
         dp[n][m]=up+low;
         return dp[n][m];
    }
    
    public int totalWays(int N, int M, int grid[][]) {
        if(N==1 && M==1 && grid[0][0]==1)
        {
            return 0;
        }
         if(N==1 && M==1 && grid[0][0]==0)
        {
            return 1;
        }
        int dp[][]=new int[N][M];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                dp[i][j]=-1;
            }
        }
        
        int ans=helper(N-1,M-1,grid,dp);
        return ans;
        
        
    }

====================================================================================

    public int totalWays(int N, int M, int grid[][]) {
       
           if(N==1 && M==1 && grid[0][0]==1)
        {
            return 0;
        }
         if(N==1 && M==1 && grid[0][0]==0)
        {
            return 1;
        }
         int dp[][]=new int[N][M];
        
        dp[0][0]=1;
        
          for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                
                 if(i==0 && j==0)
                 {
                    dp[0][0]=1;
                    continue;
                 }
                 
             else if(i>=0 && j>=0 && grid[i][j]==1)
               {
                 dp[i][j]=0;
               }
               
               else
               {
                    int up=0;
                    int low=0;
                     
                    if(i>=1) up=dp[i-1][j] % 1000000007;
                    if(j>=1)  low=dp[i][j-1] % 1000000007;
                    
                    dp[i][j]=up+low;
               }
               
            }
        }
        
        return dp[N-1][M-1];

    }

