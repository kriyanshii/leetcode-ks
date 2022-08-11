if(root == null) return true;
Stack<TreeNode> stack = new Stack<>();
TreeNode pre = null;
while(root != null || !stack.isEmpty()){
while(root != null){
stack.push(root);
root = root.left;
}
root = stack.pop();
if(pre != null && root.val <= pre. val) return false;
pre = root;
root = root.right;
}
return true;
https://leetcode.com/problems/validate-binary-search-tree/discuss/32112/Learn-one-iterative-inorder-traversal-apply-it-to-multiple-tree-questions-(Java-Solution)