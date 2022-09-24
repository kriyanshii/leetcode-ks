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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        traverse(root, targetSum, new ArrayList<Integer>(), res);
        return res;
    }
    
    public void traverse(TreeNode root, int sum, List<Integer> sol, List<List<Integer>> res){
        if(root == null) return;
        
        sol.add(root.val);
        if(root.left == null && root.right == null && sum == root.val){
            res.add(new ArrayList<>(sol));
        }
        else{
            traverse(root.left, sum - root.val, sol, res);
            traverse(root.right, sum - root.val, sol, res);
        }
        sol.remove(sol.size() - 1);
    }
}