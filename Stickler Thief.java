//Stickler Thief

class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        int ans=helper(n-1,arr,dp);
        return ans;
    }
    
    public int helper(int idx,int arr[],int dp[])
    {
        if(idx==0){
           return arr[idx];
        }
        if(idx<0){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        
        int fs=arr[idx]+helper(idx-2,arr,dp);
        int ss=0+helper(idx-1,arr,dp);
        dp[idx]=Math.max(fs,ss);
        return dp[idx];
        
    }
}


=========================================================================================

  
