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
    public int maxDepth(TreeNode root) {
        return helper(root,0);
    }
    int helper(TreeNode node,int max){
        if(node == null ){
            return max;
        }
        int left=helper(node.left,max+1);
        int right=helper(node.right,max+1);
        return Math.max(right,left);
    }
}