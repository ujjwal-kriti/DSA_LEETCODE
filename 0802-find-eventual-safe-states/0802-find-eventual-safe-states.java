class Solution {

    public List<Integer> eventualSafeNodes(int[][] graph) {

        int V = graph.length;   // Number of nodes

        // Step 1: Create reverse graph
        // revAdj[v] will store all nodes that point to v
        List<List<Integer>> revAdj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            revAdj.add(new ArrayList<>());
        }

        // Step 2: Outdegree array
        // outdegree[i] = number of outgoing edges from node i
        int[] outdegree = new int[V];

        // Step 3: Build reverse graph and outdegree
        for (int i = 0; i < V; i++) {
            outdegree[i] = graph[i].length; // count outgoing edges

            for (int neighbor : graph[i]) {
                // reverse edge: neighbor -> i
                revAdj.get(neighbor).add(i);
            }
        }

        // Step 4: Queue for BFS
        // Nodes with outdegree 0 are terminal nodes (safe)
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (outdegree[i] == 0) {
                q.add(i);
            }
        }

        // This list will store all safe nodes
        List<Integer> safeNodes = new ArrayList<>();

        // Step 5: BFS (Kahn’s Algorithm)
        while (!q.isEmpty()) {

            int node = q.poll();
            safeNodes.add(node);   // node is safe

            // Reduce outdegree of its parents
            for (int parent : revAdj.get(node)) {
                outdegree[parent]--;

                // If outdegree becomes 0, parent becomes safe
                if (outdegree[parent] == 0) {
                    q.add(parent);
                }
            }
        }

        // Step 6: Sort result as required by problem
        Collections.sort(safeNodes);

        return safeNodes;
    }
}
