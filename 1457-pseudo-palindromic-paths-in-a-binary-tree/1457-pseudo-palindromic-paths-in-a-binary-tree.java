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
  int res = 0;
  public int pseudoPalindromicPaths (TreeNode root) {
    if (root == null)
      return res;
    compute(root,0);
    return res;
  }

  public void compute(TreeNode root,int mask) {
    if (root == null)
      return;

    mask ^= 1 << root.val;

    if (root.left == null && root.right == null) {
      if (mask == 0 || (mask&(mask-1)) == 0)
        res += 1;
      return;
    }

    compute(root.left, mask);
    compute(root.right, mask);

  }
}