public int pairSum(ListNode head) {
if(head == null) return 0;
ListNode slow = head, fast = head;
while(fast != null && fast.next != null){
slow = slow.next;
fast = fast.next.next;
}
slow = reverse(slow);
fast = head;
int sum = Integer.MIN_VALUE;
while(slow != null){
sum = Math.max(sum, slow.val + fast.val);
slow = slow.next;
fast = fast.next;
}
return sum;
}
public ListNode reverse(ListNode head){
if(head == null) return null;
ListNode node = head, prev = null;
while(node != null){
ListNode next = node.next;
node.next = prev;
prev = node;
node = next;
}
return prev;
}