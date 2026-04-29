
class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        
        path.add(0); // start from node 0
        dfs(0, graph, path, result);
        
        return result;
    }

    public void dfs(int node, int[][] graph, List<Integer> path, List<List<Integer>> result) {
        // if reached last node
        if (node == graph.length - 1) {
            result.add(new ArrayList<>(path));
            return;
        }

        // explore neighbors
        for (int next : graph[node]) {
            path.add(next);           // choose
            dfs(next, graph, path, result); // explore
            path.remove(path.size() - 1);   // backtrack
        }
    }
}