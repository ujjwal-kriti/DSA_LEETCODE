class Solution {

    public void solve(char[][] board) {

        //  Edge case: if board is empty
        if (board == null || board.length == 0 || board[0].length == 0) return;

        int m = board.length;
        int n = board[0].length;

        // STEP 1: Visit all boundary cells (edges)
        // If boundary cell is 'O', then that 'O' and its connected region are SAFE
        // so we mark them as '#'

        // ✅ check first and last column of every row
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') dfs(board, i, 0);       // left boundary
            if (board[i][n - 1] == 'O') dfs(board, i, n - 1); // right boundary
        }

        //  check first and last row of every column
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') dfs(board, 0, j);        // top boundary
            if (board[m - 1][j] == 'O') dfs(board, m - 1, j); // bottom boundary
        }

        // STEP 2:
        // Now convert all remaining 'O' -> 'X' (because they are surrounded)
        // And convert all '#' -> 'O' (restore safe cells)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // surrounded region -> capture it
                if (board[i][j] == 'O') board[i][j] = 'X';

                // safe region -> restore it
                else if (board[i][j] == '#') board[i][j] = 'O';
            }
        }
    }

    //  DFS function to mark all connected boundary O's as safe
    private void dfs(char[][] board, int i, int j) {

        int m = board.length;
        int n = board[0].length;

        //  Stop if out of boundary
        if (i < 0 || j < 0 || i >= m || j >= n) return;

        // Stop if not 'O'
        if (board[i][j] != 'O') return;

        //  Mark as safe visited
        board[i][j] = '#';

        //  Move in 4 directions
        dfs(board, i + 1, j); // down
        dfs(board, i - 1, j); // up
        dfs(board, i, j + 1); // right
        dfs(board, i, j - 1); // left
    }
}
