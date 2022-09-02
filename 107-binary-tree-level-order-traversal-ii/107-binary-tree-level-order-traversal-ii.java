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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        compute(list, root, 0);
        return list;
    }
    
    public void compute(List<List<Integer>> list, TreeNode root, int level){
        if(root == null) return;
        
        if(list.size() == level) list.add(0, new ArrayList<>());
        
        list.get(list.size() - level - 1).add(root.val);
        compute(list, root.left, level + 1);
        compute(list, root.right, level + 1);
    }
}