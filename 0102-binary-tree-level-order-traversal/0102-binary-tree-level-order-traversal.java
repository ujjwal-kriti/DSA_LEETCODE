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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>>result=new ArrayList<>();
       if(root==null) return result;
       //create a queue
       Queue<TreeNode>queue=new LinkedList<>();
       queue.offer(root);
       while(!queue.isEmpty()){
            //number of nodes in current level
            int size=queue.size();
            //store current level
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node =queue.poll();
                //adding the nodes value to the current level
                level.add(node.val);
                //push its children in to queue 
                if(node.left !=null)queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
               result.add(level);
       }
        return  result;

    }
}