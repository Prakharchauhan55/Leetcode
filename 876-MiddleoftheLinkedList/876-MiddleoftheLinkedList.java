// Last updated: 2/8/2026, 10:51:24 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode middleNode(ListNode head) {
13        ListNode f = head;
14        ListNode s = head;
15        while(s != null && s.next != null){
16            f = f.next;
17            s = s.next.next;
18        }
19        // ListNode curr = f.next;
20        return f;
21    }
22}