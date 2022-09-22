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
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null || root.left == null || root.right == null) return -1;
        Queue<TreeNode> q = new LinkedList<>();
        Integer secondMin = null;
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr.left != null) q.offer(curr.left);
            if(curr.right != null) q.offer(curr.right);
            if(curr.val != root.val){
                if(secondMin == null) secondMin = curr.val;
                else{
                    secondMin = Math.min(secondMin, curr.val);
                }
            }
        }
        return secondMin == null ? -1 : secondMin;
    }
}