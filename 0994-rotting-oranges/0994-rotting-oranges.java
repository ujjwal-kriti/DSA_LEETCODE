class Solution {
    public int orangesRotting(int[][] grid) {
       int n=grid.length;
       int m=grid[0].length;
       int fresh=0;
       Queue<int[]>q= new LinkedList<>();
       for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
       }
       //bfs
       int[][] dir={{-1,0},{1,0},{0,-1},{0,1}};
       int min=0;
        while(!q.isEmpty() && fresh>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                int [] curr=q.poll();
                int r=curr[0];
                int c=curr[1];
                for(int[] d:dir){
                    int nr=r+d[0];
                    int nc=c+d[1];
                     if (nr >= 0 && nc >= 0 && nr < n && nc < m && grid[nr][nc] == 1) {
                          grid[nr][nc] = 2;
                          fresh--;
                           q.offer(new int[]{nr, nc});
                     }

                }
            }
            min++;
        }
        return fresh == 0 ? min : -1;
    }
}
// 4-direction movement (Up, Down, Left, Right)
// From cell (r, c):
// Up    -> (r-1, c)
// Down  -> (r+1, c)
// Left  -> (r, c-1)
// Right -> (r, c+1)