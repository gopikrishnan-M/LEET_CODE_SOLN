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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)  return;

        //find the middle
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head1=head;
        ListNode head2=reverseList(slow.next);
        slow.next=null;
        
        //reorder
        while( head1 != null && head2 != null){
            ListNode temp=head1.next;
            head1.next=head2;
            head1=temp;

            temp=head2.next;
            head2.next=head1;
            head2=temp;

            
        }
       
    }

    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode Next=curr.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=Next;
            if(Next!=null)Next=Next.next;
        }
        return prev;
    }
}