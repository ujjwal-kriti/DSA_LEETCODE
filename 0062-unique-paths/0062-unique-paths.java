class Solution {
    // public int uniquePaths(int m, int n) {
    //     return f(0,0,m,n);
    // }
    //     //---rrecurrence relation----------
    //     private int f(int i,int j,int m,int n){
    //         if(i==m-1 && j==n-1){
    //             return 1;
    //         }
    //         if(i>m || j>n){
    //             return 0;
    //         }
    //         int right=f(i,j+1,m,n);
    //         int down=f(i+1,j,m,n);
    //         return right+down;
    //     }
    
    //-----------------using memoization-----------
    // public int uniquePaths(int m, int n) {
    //     int[][] dp=new int[m][n];
    //      for(int i = 0; i < m; i++){
    //         for(int j = 0; j < n; j++){
    //             dp[i][j] = -1;
    //         }
    //     }
    //      return f(0, 0, m, n, dp);
    // }
    // private int f(int i,int j,int m,int n,int [][]dp){
    //     if(i==m-1 && j==n-1){
    //       return 1;
    //     }
    //      if(i >= m || j >= n)
    //         return 0;
    //          // memoization check
    //     if(dp[i][j] != -1)
    //         return dp[i][j];

    //     int right = f(i, j+1, m, n, dp);
    //     int down = f(i+1, j, m, n, dp);

    //     return dp[i][j] = right + down;
    // }

    //--------------------------tabulation--------------
     public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    dp[i][j]=1;
                }else{
                    int up=0;
                    int left=0;
                    if(i>0){
                        up=dp[i-1][j];
                    }
                    if(j>0){
                        left=dp[i][j-1];
                    }
                    dp[i][j]=up+left;
                }
            }
        }
        return dp[m-1][n-1];
    } 
}
// 3️⃣ Both represent the same idea
// These two relations are actually the same mathematically.
// Memoization view:
// paths from (i,j) → end
// = right + down
// Tabulation view:
// paths to reach (i,j)
// = up + left
// Just opposite direction thinking.
// forward → right + down
// backward → up + left