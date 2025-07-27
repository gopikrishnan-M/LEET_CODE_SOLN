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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        //we must check weather the sum is equal or not till the root but not in between it should form a complete path from root to leaf so we check equal to target , left and right should be null
        if(root.val==targetSum && root.left==null && root.right==null){
            return true;
        }
    //here subtract the current value from the root value and pass that value to the next sucessor recursion when the condition is satisfied we get true as there is "||" operator in between
        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
    }
}