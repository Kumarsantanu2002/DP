//Frogs and Jumps

class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        // Code here
        boolean vis[] =new boolean[leaves+1];
        int ans=0;
        
        for(int i=0;i<N;i++)
        {
            if(frogs[i]<=leaves && !vis[frogs[i]])
            {
                for(int j=frogs[i];j<vis.length;j+=frogs[i])
                {
                    if(!vis[j]){
                        vis[j]=true;
                    }
                }
            }
        }
        
        //
        for(int i=1;i<=leaves;i++)
        {
            if(!vis[i]){
                ans++;
            }
        }
    return ans;
        
    }
}
