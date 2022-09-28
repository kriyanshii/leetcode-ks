ListNode newHead = new ListNode(0);
newHead.next = head;
ListNode prev = newHead;
ListNode curr = newHead;
for(int i = 0; i < n; i++){
curr = curr.next;
}
while(curr.next != null){
curr = curr.next;
prev = prev.next;
}
prev.next = prev.next.next;
return newHead.next;