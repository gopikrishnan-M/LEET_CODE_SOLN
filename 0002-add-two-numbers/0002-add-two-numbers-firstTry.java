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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val=0,rem=0,v1=0,v2=0;
        ListNode head=new ListNode();
        ListNode t3=head;
        while(l1!=null||l2!=null||rem!=0){
            v1=(l1==null)?0:l1.val;
            v2=(l2==null)?0:l2.val;
            val=v1+v2+rem;
            rem=val/10;
            t3.next=new ListNode(val%10);
            t3=t3.next;
            l1=(l1==null)?l1:l1.next;
            l2=(l2==null)?l2:l2.next;
        }
        return head.next;
    }
}