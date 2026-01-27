class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        //---------------------------topo sort code using bfs-------------

         // Step 2: Create indegree array
        // indegree[i] = number of incoming edges to node i
        int [] indegree=new int[numCourses];
        // Step 3: Fill adjacency list and indegree array
        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            adj.get(u).add(v);//Value is between 0 and V-1 small v u->v
            indegree[v]++;
        }
          // Step 4: Push all nodes with indegree 0 into queue
        // These nodes have no dependency
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)//Means total number of vertices (nodes),Fixed number
        //Used in loops, array sizes
        {
            if(indegree[i]==0){
                q.add(i);
            }
        }
         // This will store the topological order
          ArrayList<Integer> topo = new ArrayList<>();
          //bfs
          while(!q.isEmpty()){
              int node=q.poll();
              topo.add(node);
              //reduce indegree of all its neighbour
               for (int neighbor : adj.get(node)) {
                indegree[neighbor]--;

                // If indegree becomes 0, add to queue
                if (indegree[neighbor] == 0) {
                    q.add(neighbor);
                }
            }
          }
        return(topo.size()==numCourses);
      
    }
}
//----------------------------using count ---------------------------------------------

        // // Adjacency list
        // ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        // for (int i = 0; i < numCourses; i++) {
        //     adj.add(new ArrayList<>());
        // }

        // // Indegree array
        // int[] indegree = new int[numCourses];

        // // Build graph
        // for (int i = 0; i < prerequisites.length; i++) {
        //     int u = prerequisites[i][0];
        //     int v = prerequisites[i][1];
        //     adj.get(u).add(v);
        //     indegree[v]++;
        // }

        // // Queue for BFS
        // Queue<Integer> q = new LinkedList<>();
        // for (int i = 0; i < numCourses; i++) {
        //     if (indegree[i] == 0) {
        //         q.add(i);
        //     }
        // }

        // int count = 0; // number of courses completed

        // // BFS (Kahn's Algorithm)
        // while (!q.isEmpty()) {
        //     int node = q.poll();
        //     count++;

        //     for (int neighbor : adj.get(node)) {
        //         indegree[neighbor]--;
        //         if (indegree[neighbor] == 0) {
        //             q.add(neighbor);
        //         }
        //     }
        // }

        // // If all courses are completed → possible
        // return count == numCourses;