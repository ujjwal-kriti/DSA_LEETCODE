/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    HashMap<String, Integer> map = new HashMap<>();
    List<TreeNode> res = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return res;
    }

    public String dfs(TreeNode node) {
        if (node == null) return "#";

        // DFS left
        String left = dfs(node.left);

        // DFS right
        String right = dfs(node.right);

        // create subtree string
        String curr = node.val + "," + left + "," + right;

        int count = map.getOrDefault(curr, 0);

        // if already seen once → duplicate
        if (count == 1) {
            res.add(node);
        }

        map.put(curr, count + 1);

        return curr;
    }
}