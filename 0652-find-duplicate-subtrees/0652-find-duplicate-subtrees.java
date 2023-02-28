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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> list = new LinkedList<>();
        helper(root, new HashMap<>(), list);
        return list;
    }
    
    public String helper(TreeNode root, Map<String, Integer> map, List<TreeNode> list){
        if(root == null) return "#";
        String serial = root.val + "," + helper(root.left, map, list) + "," + helper(root.right, map, list);
        map.put(serial, map.getOrDefault(serial, 0) + 1);
        if(map.get(serial) == 2) list.add(root);
        return serial;
    }
}