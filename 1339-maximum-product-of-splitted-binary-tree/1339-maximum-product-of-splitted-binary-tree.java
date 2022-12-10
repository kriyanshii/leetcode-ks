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
    long total = 0, res = 0, sub;
    public int maxProduct(TreeNode root) {
        total = count(root);
        count(root);
        return (int)(res % (int) (1e9+7));
    }
    
    public long count(TreeNode root){
        if(root == null) return 0;
        sub = root.val + count(root.left) + count(root.right);
        res = Math.max(res, sub * (total - sub));
        return sub;
    }
}