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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        rightView(root, list, 0);
        return list;
    }
    public void rightView(TreeNode cur, List<Integer> list, int currDepth){
        if(cur == null)
            return;
        if(currDepth == list.size()){
            list.add(cur.val);
        }
        rightView(cur.right, list, currDepth + 1);
        rightView(cur.left, list, currDepth + 1);
    }
}