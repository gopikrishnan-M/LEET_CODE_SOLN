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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);//similar to add but better than it returns false when given value is not added to the queue
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            double sum=0;
            for(int i=0;i<levelSize;i++){
                TreeNode cnode=queue.poll();
                sum+=cnode.val;
                if (cnode.left != null) {
                    queue.offer(cnode.left);
                }
                if (cnode.right != null) {
                    queue.offer(cnode.right);
                }
            }
            result.add(sum/levelSize);
        }
        return result;
    }
}