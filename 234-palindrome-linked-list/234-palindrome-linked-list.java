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
        ListNode mid = middleNode(head);
        ListNode halfRev = reverseList(mid);
        ListNode headSec = halfRev;
        
        while(headSec != null && head != null){
            if(headSec.val != head.val){
                break;
            }
            headSec = headSec.next;
            head = head.next;
        }
        
        halfRev = reverseList(halfRev);
        return (head == null) || (headSec == null);
    }
    
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode pres = head, prev = null;
        ListNode next = pres.next;
        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }
    
    public ListNode middleNode(ListNode head){
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
} 