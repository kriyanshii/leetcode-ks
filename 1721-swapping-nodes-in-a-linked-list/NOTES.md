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