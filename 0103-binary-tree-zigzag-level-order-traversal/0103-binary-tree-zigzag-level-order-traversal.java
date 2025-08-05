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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> deque=new LinkedList<>();
        deque.offer(root);
        boolean forward=true;
        while (!deque.isEmpty()) {
            int levelSize=deque.size();
            List<Integer> currentLevel=new ArrayList<>();
            if (forward) {
                for(int i=0;i<levelSize;i++){
                    TreeNode cnode=deque.removeFirst();
                    currentLevel.add(cnode.val);
                    if (cnode.left != null) {
                        deque.addLast(cnode.left);
                    }
                    if (cnode.right != null) {
                        deque.addLast(cnode.right);
                    }
                }
                result.add(currentLevel);
            }
            else {
                for (int i = 0; i < levelSize; i++) {
                    TreeNode cnode=deque.removeLast();
                    currentLevel.add(cnode.val);
                    if (cnode.right != null) {
                        deque.addFirst(cnode.right);
                    }
                    if (cnode.left != null) {
                        deque.addFirst(cnode.left);
                    }
                }
                result.add(currentLevel);
            }
            forward=!forward;
        }
        return result;
    }
}