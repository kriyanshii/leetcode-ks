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
    public int pseudoPalindromicPaths (TreeNode root) {
        return helper(root, new HashSet<>());
    }
    
    public int helper(TreeNode root, HashSet<Integer> set){
        if(root == null) return 0;
        
        if(set.contains(root.val)){
            set.remove(root.val);
        }else{
            set.add(root.val);
        }
        
        if(root.left == null && root.right == null){
            return set.size() <= 1 ? 1 : 0;
        }
        
        int left = helper(root.left, new HashSet<>(set));
        int right = helper(root.right, new HashSet<>(set));
        
        return left + right;
    }
}