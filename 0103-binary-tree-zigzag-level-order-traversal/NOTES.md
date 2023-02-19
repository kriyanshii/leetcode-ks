public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
List<List<Integer>> list = new ArrayList<>();
if(root == null)
return list;
Queue<TreeNode> q = new LinkedList<>();
q.offer(root);
boolean normalorder = false;
while(!q.isEmpty()){
int size = q.size();
LinkedList<Integer> levelValues = new LinkedList<>();
normalorder = !normalorder;
while(size > 0){
size--;
TreeNode cur = q.poll();
if(normalorder)
levelValues.add(cur.val);
else
levelValues.addFirst(cur.val);
if(cur.left != null)
q.offer(cur.left);
if(cur.right != null)
q.offer(cur.right);
}
//System.out.println("Level values are "+levelValues);
list.add(levelValues);
}
return list;
}
​