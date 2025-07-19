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
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        helper(queue,root);
        TreeNode node=queue.poll();
        while(!queue.isEmpty()){
            node.right=queue.poll();
            node.left=null;
            node=node.right;
        }
    }
    public void helper(Queue<TreeNode> queue,TreeNode node){
        if(node==null){
            return;
        }
        queue.offer(node);
        helper(queue,node.left);
        helper(queue,node.right);
    }
}