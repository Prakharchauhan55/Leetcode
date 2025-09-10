// Last updated: 9/10/2025, 6:22:05 PM
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
        // if (head == null){
        //     return;
        // }
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            // next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            // prev = curr;
        }
        return prev;
    }
}