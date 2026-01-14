class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
       boolean []visited=new boolean[n];
        int province=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,isConnected,visited);
                province++;
            }
        }
        return province;
    }

    private void dfs(int city,int [][]isConnected,boolean[]visited){
          // Mark the current city as visited
        visited[city]=true;
        for(int j=0;j<isConnected.length;j++){
            //When should I go to city j?
            //They are connected
            //City j is NOT visited
            if(isConnected[city][j]==1 && !visited[j]){
                //visit that connected city
                dfs(j,isConnected,visited);
            }
        }
    }
}