//213. House Robber II

class Solution {
    public int rob(int[] nums) {
     if(nums.length==1){
        return nums[0];
     }
    int temp1[]= Arrays.copyOfRange(nums,0,nums.length-1);
    int temp2[]= Arrays.copyOfRange(nums,1,nums.length);
     int ans1= helper(temp1);
     int ans2=helper(temp2);
     return Math.max(ans1,ans2);
            
    }
    public int helper(int[] temp){
      
      int n=temp.length;
      if(n==1){
        return temp[0];
      }
      if(n==2){
        return Math.max(temp[0],temp[1]);
      }

      int prev1=temp[0];
      int prev2=0;
      for(int i=1;i<n;i++)
      {
        int fs=temp[i];
        if(i>=2){
            fs+=prev2;
        }
        int ss=prev1;
        int tem=Math.max(fs,ss);
        prev2=prev1;
        prev1=tem;
      }
      return prev1;
    }
}
