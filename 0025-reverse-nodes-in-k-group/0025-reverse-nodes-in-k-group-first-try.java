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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null)
            return head;
        ListNode find = head;
        int count = 0;
        while (find != null) {
            count++;
            find = find.next;
        }
        ListNode curr = head;
        ListNode prev = null;
        for (int tr = 0; tr < count / k; tr++) {
            ListNode left = prev;
            ListNode orgEnd = curr;
            ListNode next = curr.next;
            for (int i = 0; curr != null && i < k; i++) {
                curr.next = prev;
                prev = curr;
                curr = next;
                if (next != null) {
                    next = next.next;
                }
            }
            if (left != null)
                left.next = prev;
            else
                head = prev;
            orgEnd.next = curr;
            prev = orgEnd;
        }
        return head;

    }
}
