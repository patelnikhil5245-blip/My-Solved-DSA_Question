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
     int ans=0;
    public int averageOfSubtree(TreeNode root) {
       
      check(root);
        return ans;
    }

    public void check(TreeNode root) {
        if (root == null)
            return;

        int sum = sum(root);
        int nodes = Node(root);

        int average = sum / nodes;

        if (average == root.val)
            ans++;

        check(root.left);
        check(root.right);
    }

    public int sum(TreeNode root){
        if(root==null)
          return 0;
        return root.val+sum(root.left)+sum(root.right);
    }

    public int Node(TreeNode root){
        if(root==null)
           return 0;
       return 1+Node(root.left)+Node(root.right);
        
    }
}