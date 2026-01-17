class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]>q=new LinkedList<>();//queue for BFS (store orange positions)
        int fresh=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});//found rotten orange ,put its position in queue
                }
                if(grid[i][j]==1){
                    //found fresh orange,increase count
                    fresh++;
                }
            }
        }

        //if no fresh orange is presnt ,answer is 0 minutes 
        if(fresh==0) return 0;

        int minutes=0;
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        //bfs
        while(!q.isEmpty()){
            int size=q.size();// number of rotten oranges currently in the queue
            // size means 1 BFS "level" = 1 minute
            boolean rottedthisminute=false;
            for(int k=0;k<size;k++){
                int []cell=q.poll();//take one rotten orange
                int r=cell[0];
                int c=cell[1];
                for(int d=0;d<4;d++){//check its four direction
                    int nr=r+dirs[d][0];
                    int nc=c+dirs[d][1];
                    if(nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == 1){//“Is neighbour inside the grid?”, grid[nr][nc]==1 means fresh orange

                    grid[nr][nc]=2;
                    fresh--;
                    q.offer(new int[]{nr,nc});
                    rottedthisminute=true;

                    }
                }
            }
            if(rottedthisminute)minutes++;
            
        }
        if(fresh==0)return minutes;
        return -1;
    }
}
// 4-direction movement (Up, Down, Left, Right)
// From cell (r, c):
// Up    -> (r-1, c)
// Down  -> (r+1, c)
// Left  -> (r, c-1)
// Right -> (r, c+1)