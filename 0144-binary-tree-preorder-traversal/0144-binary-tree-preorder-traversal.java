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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>ujjwal=new ArrayList<>();
        preorder(root,ujjwal);
        return ujjwal;
    }
    void preorder( TreeNode root,List<Integer>ujjwal){
    if(root==null)return;
    ujjwal.add(root.val);
    preorder(root.left,ujjwal);
    preorder(root.right,ujjwal);
}
    
}