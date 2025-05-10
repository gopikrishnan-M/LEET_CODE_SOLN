/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans=new int[m][n];
        for(int[] arr:ans){
            Arrays.fill(arr, -1);
        }
        boundary(ans,head,0,m-1,0,n-1);
        return ans;
    }
    public static void boundary(int[][] ans,ListNode head,int rs,int re,int cs,int ce){
        if(rs>re||cs>ce||head==null){//basic just do it
            return;
        }
        //top row
        for(int i=cs;i<=ce&&head!=null;i++){
            ans[rs][i]=head.val;
            head=head.next;
        }
        rs++;
        //last col
        for(int i=rs;i<=re&&head!=null;i++){
            ans[i][ce]=head.val;
            head=head.next;
        }
        ce--;
        //last row
        if (rs <= re) {
            for(int i=ce;i>=cs&&head!=null;i--){
                ans[re][i]=head.val;
                head=head.next;
            }
            re--;
        }
        //move up
        if(cs<=ce){
            for(int i=re;i>=rs&&head!=null;i--){
                ans[i][cs]=head.val;
                head=head.next;
            }
            cs++;
        }
        boundary(ans, head, rs, re, cs, ce);
    }
}