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

==================================================================
    class Solution {
    int findMaxSum(int arr[], int n) {
        if(n==1){
            return arr[0];
        }
        if(n==2){
            return Math.max(arr[0],arr[1]);
        }
        
       int dp[]=new int[n];
        dp[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            int fs=arr[i];
            if(i>1){
                fs+=dp[i-2];
            }
            int ss=dp[i-1];
            
            dp[i]=Math.max(fs,ss);
        }
        return dp[n-1];
    }   
}

==========================
    class Solution {
    int findMaxSum(int arr[], int n) {
        if(n==1){
            return arr[0];
        }
        if(n==2){
            return Math.max(arr[0],arr[1]);
        }
        
       int prev1=arr[0];
       int prev2=0;
        for(int i=1;i<n;i++)
        {
            int fs=arr[i];
            if(i>1){
                fs+=prev2;
            }
            int ss=prev1;
            
            int temp=Math.max(fs,ss);
            prev2=prev1;
            prev1=temp;
        }
        return prev1;
    }
    
    
}
