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
    public ListNode reverseBetween(ListNode head, int l, int r) {
        if(l==r) return head;
        ListNode curr=head;
        ListNode prev=null;

        for(int i=1;curr!=null&&i<l;i++){
            prev=curr;
            curr=curr.next;
        }
        ListNode left=prev;
        ListNode orgEnd=curr;
        ListNode next=curr.next;
        for(int i=0;curr!=null&&i<r-l+1;i++){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null){
                next=next.next;
            }
        }
        if(left!=null) left.next=prev;
        else head=prev;
        orgEnd.next=curr;
        return head;
    }
}