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
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        return helper(null,head);
    }
    public ListNode helper(ListNode prev,ListNode curr){
        if(curr==null){
            return prev;
        }
        ListNode next=curr.next;
        curr.next=prev;
        return helper(curr,next);
    }
}