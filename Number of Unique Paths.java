// Number of Unique Paths

class Solution
{
    
    public static int helper(int dp[][],int a ,int b)
    {
        if(a==0 &&b==0){
            return 1;
        }
        if(a<0 || b<0){
            return 0;
        }
        if(dp[a][b]!=-1)
        {
            return dp[a][b];
        }
        
        int left=helper(dp,a-1,b);
        int right=helper(dp,a,b-1);
        
        dp[a][b]=left+right;
        return dp[a][b];
    }
    //Function to find total number of unique paths.
    public static int NumberOfPath(int a, int b) 
    {
       int dp[][]=new int[a][b];
       for(int i=0;i<a;i++)
       {
           for(int j=0;j<b;j++)
           {
               dp[i][j]=-1;
           }
           
       }
      
       
      int ans=helper(dp,a-1,b-1);
      return ans;
    }
}

==============================================================================


  public static int NumberOfPath(int a, int b) 
    {
       int dp[][]=new int[a][b];
       dp[0][0]=1;
   
       
       for(int i=0;i<a;i++){
           for(int j=0;j<b;j++){
               
               if(i==0 && j==0)
               {
                   continue;
               }
               else
               {
                   
                  int left=0;
                  int right=0;
                  
                  if(i>0) 
                  {
                    left=dp[i-1][j];
                   
                  }
                 if(j>0)
                 {
                    right=dp[i][j-1];
                 }
                  
                  
                  dp[i][j]=left+right;
                 }
                 
            
           }
       }
      
        return dp[a-1][b-1];
    }
