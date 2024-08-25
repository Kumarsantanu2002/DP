//Max Sum without Adjacents
class Solution {
    int findMaxSum(int arr[], int n) {
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        int ans=helper(n-1,arr,dp);
        return ans;
    }
    
    int helper(int idx,int arr[],int dp[])
    {
        if(idx==0)
        {
            return arr[0];
        }
        if(idx<0){
            return 0;
        }
        
        if(dp[idx]!=-1)
        {
            return dp[idx];
        }
        
        int fs=arr[idx]+helper(idx-2,arr,dp);
        int ss=helper(idx-1,arr,dp);
         dp[idx]=Math.max(fs,ss);
         return dp[idx];
    }
}
