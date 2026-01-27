class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        // Step 1: Adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        // Step 2: Indegree array
        int[] indegree = new int[numCourses];

        // Step 3: Build graph (bi -> ai) , bi must come BEFORE ai

        for (int i = 0; i < prerequisites.length; i++) {
            int u = prerequisites[i][0]; // ai
            int v = prerequisites[i][1]; // bi

            adj.get(v).add(u);   // bi -> ai
            indegree[u]++;
        }

        // Step 4: Queue for BFS
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // Step 5: Store order
        int[] order = new int[numCourses];
        int idx = 0;

        // BFS (Kahn's Algorithm)
        while (!q.isEmpty()) {
            int node = q.poll();
            order[idx++] = node;

            for (int neighbor : adj.get(node)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    q.add(neighbor);
                }
            }
        }

        // If cycle exists → return empty array
        if (idx != numCourses) return new int[0];

        return order;
    }
}