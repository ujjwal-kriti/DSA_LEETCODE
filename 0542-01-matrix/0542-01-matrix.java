

class Solution {
    public int[][] updateMatrix(int[][] mat) {

        // Step 1: Get dimensions
        int n = mat.length;        // rows
        int m = mat[0].length;     // cols

        // Step 2: Create visited and distance matrices
        int[][] vis = new int[n][m];     // 0 = not visited, 1 = visited
        int[][] dist = new int[n][m];    // final answer

        // Step 3: Queue for BFS
        // We store {row, col, steps} exactly like your image
        Queue<int[]> q = new LinkedList<>();

        // Step 4: Push all 0 cells into queue (Multi-source BFS)
        // because distance from 0 to nearest 0 is 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // if cell is 0 -> start BFS from here
                if (mat[i][j] == 0) {
                    q.add(new int[]{i, j, 0}); // row, col, steps = 0
                    vis[i][j] = 1;            // mark visited
                }
                // if cell is 1 -> not visited initially
                else {
                    vis[i][j] = 0;
                }
            }
        }

        // Step 5: Direction arrays (up, right, down, left)
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};

        // Step 6: BFS traversal
        while (!q.isEmpty()) {

            // Take the front element from queue
            int[] curr = q.poll();

            int row = curr[0];
            int col = curr[1];
            int steps = curr[2];

            // store the distance for this cell
            dist[row][col] = steps;

            // check all 4 neighbours
            for (int k = 0; k < 4; k++) {

                int nrow = row + delRow[k];
                int ncol = col + delCol[k];

                // boundary check + not visited check
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0) {

                    // mark visited
                    vis[nrow][ncol] = 1;

                    // push neighbour with steps+1
                    q.add(new int[]{nrow, ncol, steps + 1});
                }
            }
        }

        // Step 7: Return answer
        return dist;
    }
}
