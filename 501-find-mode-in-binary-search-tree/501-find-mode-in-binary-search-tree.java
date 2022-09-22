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
    Integer pre = null;
    int max = 0;
    int count = 1;
    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverse(root, list);
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++) res[i] = list.get(i);
        return res;
    }
    
    //inorder traversal with extra o(1) space
    public void traverse(TreeNode root, List<Integer> list){
        if(root == null) return;
        traverse(root.left, list);
        if(pre != null){
            if(pre == root.val){
                count++;
            }else{
                count = 1;
            }
        }
        if(count > max){
            max = count;
            list.clear();
            list.add(root.val);
        }else if(count == max){
            list.add(root.val);
        }
        pre = root.val;
        traverse(root.right, list);
    }
}