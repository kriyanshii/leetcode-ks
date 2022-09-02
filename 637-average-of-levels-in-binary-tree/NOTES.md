```
q.offer(root);
while(!q.isEmpty()){
int count = q.size();
double sum = 0;
for(int i = 0; i < count; i++){
TreeNode curr = q.poll();
sum += curr.val;
if(curr.left != null) q.offer(curr.left);
if(curr.right != null) q.offer(curr.right);
}
list.add(sum / count);
}
return list;
```