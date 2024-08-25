//Geek Jump 


class Solution{
    public int minimumEnergy(int arr[],int N){
        int dp[]= new int[N];
      
        Arrays.fill(dp,-1);
        dp[0]=0;
      
        int ans=helper(arr,dp,N-1);
        return ans;

    }
     public int helper(int arr[],int dp[],int N)
     {
         
         if(N==0){
             return 0;
         }
         if(dp[N]!=-1)
         {
             return dp[N];
         }
         int jump2=Integer.MAX_VALUE;
         int jump1=helper(arr,dp,N-1)+Math.abs(arr[N]-arr[N-1]);
         if(N>=2)
             jump2=helper(arr,dp,N-2)+Math.abs(arr[N]-arr[N-2]);
         
          dp[N]=Math.min(jump1,jump2);
         return dp[N];
        
     }
}


===============================================================================



//User function Template for Java

class Solution{
    public int minimumEnergy(int arr[],int N){
       
       int jump1=0;
       int jump2=Integer.MAX_VALUE;
       int dp[]=new int[N];
       dp[0]=0;
       for(int i=1;i<N;i++)
       {
           jump1=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
           
           if(i>1){
               jump2=dp[i-2]+Math.abs(arr[i]-arr[i-2]);
           }
           
           dp[i]=Math.min(jump1,jump2);
       }
       return dp[N-1];
      
    }
    
}

