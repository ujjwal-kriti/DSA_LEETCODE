class Solution {
    public int numEnclaves(int[][] grid) {

        int m = grid.length;      // number of rows
        int n = grid[0].length;   // number of columns

        //  STEP 1: Remove all land cells (1) that are connected to boundary
        // Because from boundary land we can "walk off the grid"
        // So those lands are NOT enclaves

        //  Check first and last column for every row (left & right boundary)
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 1) dfs(grid, i, 0);         // left boundary land
            if (grid[i][n - 1] == 1) dfs(grid, i, n - 1); // right boundary land
        }

        //  Check first and last row for every column (top & bottom boundary)
        for (int j = 0; j < n; j++) {
            if (grid[0][j] == 1) dfs(grid, 0, j);         // top boundary land
            if (grid[m - 1][j] == 1) dfs(grid, m - 1, j); // bottom boundary land
        }

        //  STEP 2: Count remaining land cells (1)
        // These remaining 1's are completely surrounded by 0's
        // So they are "enclaves" (cannot walk off boundary)

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) count++;   // enclave land found
            }
        }

        return count; // answer
    }

    //  DFS: Visit all connected land cells and convert them into water (0)
    // This removes boundary-connected land region
    private void dfs(int[][] grid, int i, int j) {

        int m = grid.length;
        int n = grid[0].length;

        //  Stop if out of bounds
        if (i < 0 || j < 0 || i >= m || j >= n) return;

        //  Stop if current cell is water (0)
        if (grid[i][j] == 0) return;

        //  Mark land as visited by converting 1 -> 0
        grid[i][j] = 0;

        //  Explore 4 directions (up, down, left, right)
        dfs(grid, i + 1, j); // down
        dfs(grid, i - 1, j); // up
        dfs(grid, i, j + 1); // right
        dfs(grid, i, j - 1); // left
    }
}
