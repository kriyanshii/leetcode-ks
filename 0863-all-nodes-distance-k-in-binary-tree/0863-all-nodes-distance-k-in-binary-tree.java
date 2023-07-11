/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<TreeNode, Integer> map = new HashMap<>();
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> list = new ArrayList<>();
        find(root, target);
        dfs(root, target, k , map.get(target), list);
        return list;
    }
    
    public void dfs(TreeNode root,TreeNode target, int k, int length, List<Integer> list){
        if(root == null) return;
        if(map.containsKey(root)) length = map.get(root);
        if(length == k) list.add(root.val);
        dfs(root.left, target, k, length + 1, list);
        dfs(root.right, target, k, length + 1, list);
    }
    
    public int find(TreeNode root, TreeNode target){
        if(root == null) return -1;
        if(root == target){
            map.put(root,0);
            return 0;
        }
        
        int left = find(root.left, target);
        if(left >= 0){
            // System.out.println(root.val + " " + (left + 1));
            map.put(root, left + 1);
            return left + 1;
        }
        
        int right = find(root.right, target);
        if(right >= 0){
            // System.out.println(root.val + " " + (right + 1));
            map.put(root, right + 1);
            return right + 1;
        }
        return -1;
    }
};