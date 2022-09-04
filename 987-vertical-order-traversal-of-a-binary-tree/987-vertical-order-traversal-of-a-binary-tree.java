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
    List<int[]> list = new ArrayList<>();
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        preorder(root, 0, 0);
        Collections.sort(list, (a, b) ->{
            if(a[2] != b[2]){
                return a[2] - b[2];
            }else {
                if(a[1] != b[1]){
                    return a[1] - b[1];
                }
                else{
                    return a[0] - b[0];
                }
            }
        });
        
        List<List<Integer>> res = new ArrayList<>();
        int pre = Integer.MIN_VALUE;
        for(int[] node: list){
            // System.out.println(Arrays.toString(node));
            int row = node[2];
            if(row != pre){
                // System.out.println(1);
                res.add(new ArrayList<>());
                pre = row;
            }
            res.get(res.size() - 1).add(node[0]);
        }
        return res;
    }
    
    public void preorder(TreeNode root, int x, int y){
        if(root == null) return;
        
        list.add(new int[]{root.val, x, y});
        preorder(root.left, x + 1, y - 1);
        preorder(root.right, x + 1, y + 1);
    }
}