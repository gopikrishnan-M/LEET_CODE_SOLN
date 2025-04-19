/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int l=findLength(head);
        ListNode first=head;
        ListNode second=head;
        if(l==0){
            return null;
        }
        while(l>0){
            first=first.next;
            l--;           
        }
        while(first!=second){
            first=first.next;
            second=second.next;           
        }
        
        return first;
    }
    public int findLength(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                int count=0;
                do{
                    slow=slow.next;
                    count++;
                }while(fast!=slow);
                return count;
            }
        }
        return 0;
    }
}