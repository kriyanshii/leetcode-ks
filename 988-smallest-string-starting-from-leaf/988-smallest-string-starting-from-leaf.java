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
    String ans = "~";
    public String smallestFromLeaf(TreeNode root) {
        return dfs(root, "");
    }
    
    public String dfs(TreeNode root, String str){
        if(root == null) return str;
        str = (char) (root.val + 'a') + str;
        if(root.left == null && root.right == null  && ans.compareTo(str) > 0){
            ans = str;
        }
        dfs(root.left, str);
        dfs(root.right, str);
        return ans;
    }
}