https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/discuss/64954/My-Java-Solution
​
if(root.val > p.val && root.val > q.val){
return lowestCommonAncestor(root.left, p, q);
}else if(root.val < p.val && root.val < q.val){
return lowestCommonAncestor(root.right, p, q);
}else{
return root;
}