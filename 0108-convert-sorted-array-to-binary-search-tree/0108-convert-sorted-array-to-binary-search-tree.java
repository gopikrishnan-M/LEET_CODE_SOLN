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
    public TreeNode sortedArrayToBST(int[] arr) {
        return sortedArrToBST(arr,0,arr.length);
    }
    private static TreeNode sortedArrToBST(int[] arr,int s,int e) {
        if(s>=e) {
            return null;
        }
        int mid=(s+e)/2;
        TreeNode node=new TreeNode(arr[mid]);
        node.left=sortedArrToBST(arr,s,mid);
        node.right=sortedArrToBST(arr,mid+1,e);
        return node;
    }
}