class Solution {
    public boolean isBipartite(int[][] graph) {

        int n = graph.length;

        // color array:
        // 0  -> not colored
        // 1  -> group A
        // -1 -> group B
        int[] color = new int[n];

        // graph can be disconnected, so run DFS from every node
        for (int i = 0; i < n; i++) {

            // if node is not colored, start DFS from it
            if (color[i] == 0) {
                if (!dfs(i, 1, color, graph)) {
                    return false; // if any component is not bipartite
                }
            }
        }

        return true;
    }
     // DFS function to check bipartite
    private boolean dfs(int node, int currColor, int[] color, int[][] graph) {

        // assign color to current node
        color[node] = currColor;

        // visit all neighbors
        for (int neigh : graph[node]) {

            // if neighbor is not colored, color it with opposite color
            if (color[neigh] == 0) {
                if (!dfs(neigh, -currColor, color, graph)) {
                    return false;  // if any conflict found
                }
            }

            // if neighbor already colored and same color -> not bipartite
            else if (color[neigh] == currColor) {
                return false;
            }
        }

        // no conflict found
        return true;
    }
}
