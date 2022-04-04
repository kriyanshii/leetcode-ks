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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode pNode = head;
        List<ListNode> nodeList = new ArrayList<>();
        //storing the nodes
        while(pNode != null){
            nodeList.add(pNode);
            pNode = pNode.next;
        }
        //swapping the values
        int len = nodeList.size();
        int tmp = nodeList.get(k-1).val;
        nodeList.get(k-1).val = nodeList.get(len-k).val;
        nodeList.get(len-k).val = tmp;
        return head;
    }
}