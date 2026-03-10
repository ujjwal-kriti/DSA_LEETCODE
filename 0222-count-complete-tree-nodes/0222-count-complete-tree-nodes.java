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
    public int countNodes(TreeNode root) {
    //---------------------------------------------took o(n)tc----------------------
        // if(root==null)return 0;
        // int count=0;
        // Queue<TreeNode>q=new LinkedList<>();
        // q.add(root);
        // while(!q.isEmpty()){
        //     TreeNode node=q.poll();
        //     count++;
        //      if(node.left!=null){
        //             q.add(node.left);
        //         }
        //         if(node.right!=null){
        //             q.add(node.right);
        //         }
        // }
        // return count;
        if(root==null) return 0;
        int leftheight=leftheight(root);
         int rightheight=rightheight(root);
         if(leftheight==rightheight){
            return (1<<leftheight)-1;
         }
         return 1+countNodes(root.left)+countNodes(root.right);
    }
    private int leftheight(TreeNode node){
        int height=0;
        while(node!=null){
            height++;
            node=node.left;
        }
        return height;
    }
     private int rightheight(TreeNode node){
        int height=0;
        while(node!=null){
            height++;
            node=node.right;
        }
        return height;
    }
    
}
