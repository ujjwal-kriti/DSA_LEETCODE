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
    public TreeNode deleteNode(TreeNode root, int key) {
       if(root==null)return null;
       //case 1: key is ledss or greater
        if(key<root.val){
            root.left=deleteNode(root.left, key);
        }else if(key>root.val){
            root.right=deleteNode( root.right, key);
        }
        //case 2:   node has 0 or 1 child
        else{
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            //case 3: two children
            TreeNode temp=findMin(root.right);
            root.val=temp.val;
           root.right= deleteNode( root.right,temp.val);
        
        }
        return root;
    }
        
        private TreeNode findMin( TreeNode root){
            while(root.left!=null){
                root= root.left;
            }
            return root;
        }
    
}