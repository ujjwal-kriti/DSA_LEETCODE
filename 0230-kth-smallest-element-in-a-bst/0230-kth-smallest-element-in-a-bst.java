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
    int count=0;
    int ans=-1;
   public int kthSmallest(TreeNode root, int k) {
        inorder (root,k);
    return ans;
  } 
  public void  inorder(TreeNode root, int k){
    if(root==null) return ;
    inorder(root.left,k);
    count++;
    if(count==k){
        ans=root.val;
        return;
    }
    inorder(root.right,k);
  }
}





// class Solution {

//     PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

//     public int kthSmallest(TreeNode root, int k) {
//         dfs(root, k);
//         return pq.peek();
//     }

//     private void dfs(TreeNode root, int k) {

//         if (root == null) return;

//         pq.add(root.val);

//         if (pq.size() > k) {
//             pq.poll();
//         }

//         dfs(root.left, k);
//         dfs(root.right, k);
//     }
// }