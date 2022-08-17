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
    int i = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, Integer.MAX_VALUE);
    }
    
    public TreeNode helper(int[] a, int bound){
        if(i == a.length || a[i] > bound) return null;
        TreeNode root = new TreeNode(a[i++]);
        root.left = helper(a, root.val);
        root.right = helper(a, bound);
        return root;
    }
}