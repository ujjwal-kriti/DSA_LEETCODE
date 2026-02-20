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
 // --------------------------------Brute Force Approach:----------

// For every node in the tree:

// 1. If the node is null, it is balanced.
// 2. Calculate height of the left subtree.
// 3. Calculate height of the right subtree.
// 4. If the height difference is more than 1, return false.
// 5. Otherwise, recursively check:
//    - left subtree is balanced
//    - right subtree is balanced
//
// This approach is slow because height is recalculated
// again and again for every node (O(n^2) time complexity)


class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        if(Math.abs(leftheight-rightheight)>1){
            return false;
        }
        return isBalanced(root.left ) && isBalanced(root.right);
}
        private int height(TreeNode root){
                if(root==null) return 0;
        
        return  1+Math.max(height(root.left),height(root.right));
        }
}