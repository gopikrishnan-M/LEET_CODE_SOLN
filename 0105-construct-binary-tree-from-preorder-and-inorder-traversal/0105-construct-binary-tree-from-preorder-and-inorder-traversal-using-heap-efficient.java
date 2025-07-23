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
    int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);//mapping the value to its index \U0001f92f 
            //the index without even thinking i.e O(1) time complexity
        }
        return helper(inorder,preorder,0,inorder.length-1,map);
    }
    public TreeNode helper(int[] inorder, int[] preorder, int left, int right, HashMap<Integer, Integer> map ){
        if(left>right){
            return null;
        }
        int current=preorder[index++];
        TreeNode node=new TreeNode(current);
        if(left==right){
            return node;
        }
        int mapIndex=map.get(current);
        node.left=helper(inorder,preorder,left,mapIndex-1,map);
        node.right=helper(inorder,preorder,mapIndex+1,right,map);
        return node;
    }
}