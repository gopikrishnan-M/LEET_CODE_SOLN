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
        List<List<Integer>> result=new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);//similar to add but better than tat
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            List<Integer> currentLevel=new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                TreeNode cnode=queue.poll();//similar to remove
                currentLevel.add(cnode.val);
                if (cnode.left != null) {
                    queue.offer(cnode.left);
                }
                if (cnode.right != null) {
                    queue.offer(cnode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}