if(root == null) return 0;
if(start.size() == level){
start.add(order);
end.add(order);
}else{
end.set(level,order);
}
int curr = end.get(level) - start.get(level) + 1;
int left = traverse(root.left, level+1, 2*order,start, end);
int right = traverse(root.right, level+1, 2*order + 1,start, end);
return Math.max(curr, Math.max(left, right));