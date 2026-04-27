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
    List<Integer> res = new ArrayList<>();

    public int kthLargestPerfectSubtree(TreeNode root, int k) {
        inorder(root);

        // sort in descending order
        Collections.sort(res, Collections.reverseOrder());

        if (res.size() < k) return -1;

        return res.get(k - 1);
    }

    public int inorder(TreeNode node) {
        if (node == null) return 0;

        int l = inorder(node.left);
        int r = inorder(node.right);

        // if not perfect
        if (l == -1 || r == -1 || l != r) {
            return -1;
        }

        int size = l + r + 1;
        res.add(size);

        return size;
    }
}