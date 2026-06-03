class Solution {
    public int uniquePaths(int m, int n) {

    int[][] dp = new int[m][n];

    // Fill all cells with 1
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            dp[i][j] = 1;
        }
    }

    for(int i = 1; i < m; i++) {
        for(int j = 1; j < n; j++) {
            dp[i][j] = dp[i-1][j] + dp[i][j-1];
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