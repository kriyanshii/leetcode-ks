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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode prev = newHead;
        ListNode curr = newHead;
        for(int i=0; i<n; i++){
            curr = curr.next;
        }
        while(curr.next != null){
            curr = curr.next;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return newHead.next;
    }
}