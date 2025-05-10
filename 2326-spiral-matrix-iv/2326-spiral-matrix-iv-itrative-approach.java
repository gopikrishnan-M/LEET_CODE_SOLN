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
    public int[][] spiralMatrix(int row, int col, ListNode head) {
        int[][] ans=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ans[i][j]=-1;
            }
        }
        int rs=0,re=row-1,cs=0,ce=col-1;
        while( rs<=re && cs<=ce &&  head!=null){
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
        }
        return ans;
    }
}