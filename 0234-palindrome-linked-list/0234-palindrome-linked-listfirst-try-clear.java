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
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middleNode(head);
        ListNode sh=reverseList(mid);
        while( head != null && sh != null ){
            if(head.val!=sh.val) return false;
            head=head.next;
            sh=sh.next;
        }
        return true;
    }
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
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