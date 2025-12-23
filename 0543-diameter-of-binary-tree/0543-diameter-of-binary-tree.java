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

 // ----------------brute force---------------------
 //Brute force approach
 //At each node, you calculate height of left and height of right separately for every node, AND
 //Check balance/diameter for every node independently
//Problem: heights are recalculated many times → O(n²)


class Solution {
    //--------optimal approach ------------------
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        //Height → longest path from a node to a leaf
        //Diameter → longest path between two nodes
       height(root);
       return diameter;
    }
    int height(TreeNode root){
         if(root==null) return 0;
        int left=height(root.left);
        int right=height(root.right);
      diameter=Math.max(diameter,left+right);
      //After updating diameter, we return height to parent:
      return 1+Math.max(left,right);
    }
}