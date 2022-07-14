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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return traversal(0, 0, inorder.length - 1, preorder, inorder);
    }
    
    public TreeNode traversal(int preStart, int inStart, int inEnd, int[] preOrder, int[] inOrder){
        if(preStart > preOrder.length - 1 || inStart > inEnd){
            return null;
        }
        
        TreeNode root = new TreeNode(preOrder[preStart]);
        int inIndex = 0;
        for(int i = inStart; i <= inEnd; i++){
            if(inOrder[i] == root.val){
                inIndex = i;
            }
        }
        root.left = traversal(preStart + 1, inStart, inIndex - 1, preOrder, inOrder);
        root.right = traversal(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preOrder, inOrder);
        return root;
    }
}