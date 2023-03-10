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
    ListNode h;
    Random random;

    public Solution(ListNode head) {
        h = head;
        random = new Random();
    }
    
    public int getRandom() {
        ListNode c = h;
        int r = c.val;
        for(int i = 1; c.next != null; i++){
            c = c.next;
            if(random.nextInt(i + 1) == i) r = c.val;
        }
        return r;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */