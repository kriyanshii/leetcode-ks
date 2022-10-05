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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        for(int i = 1; i < depth-1; i++){
            int size = q.size();
            for(int j = 0; j < size; j++){
                TreeNode t = q.poll();
                if(t.left != null)q.add(t.left);
                if(t.right != null) q.add(t.right);
            }
        }
        
        while(!q.isEmpty()){
            TreeNode t = q.poll();
            TreeNode tmp = t.left;
            t.left = new TreeNode(val);
            t.left.left= tmp;
            tmp = t.right;
            t.right = new TreeNode(val);
            t.right.right = tmp;
        }
        return root;
    }
}