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
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        inorder(root, al);
        return buildTree(al);
    }
    
    // to create tree from arraylist
    private TreeNode buildTree(ArrayList<Integer> al){
        if(al.size() == 0) return null;
        TreeNode root = new TreeNode(al.remove(0));
        // recursion
        root.right = buildTree(al);
        return root;
    }
    
    //for inorder traversal
    private void inorder(TreeNode root, ArrayList<Integer> al){
        if(root == null) return;
        inorder(root.left, al);
        al.add(root.val);
        inorder(root.right, al);
    }
}