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
    int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxsum;
    }
    private int dfs(TreeNode node){
        if(node==null) return 0;
        //get max from left and right
        int left=Math.max(0,dfs(node.left));
        int right=Math.max(0,dfs(node.right));
        int currpath=left+right+node.val;
        maxsum=Math.max(maxsum,currpath);
        return node.val+Math.max(left,right);
    }
}