/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        return traverse(root, 0, 1, new ArrayList<>(), new ArrayList<>());
    }
    
    //order means no of child nodes
    
    public int traverse(TreeNode root, int level, int order, List<Integer> start, List<Integer> end){
        if(root == null) return 0;
        if(start.size() == level){
            start.add(order);
            end.add(order);
        }else{
            end.set(level, order);
        }
        int cur = end.get(level) - start.get(level)  + 1;
        int left = traverse(root.left, level+1, order*2,start, end);
        int right = traverse(root.right, level+1, order*2 + 1,start, end);
        return Math.max(cur, Math.max(left, right));
    }
}