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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)
            return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        // int turn = 1;
        boolean order = false;
        while(!q.isEmpty()){
            int n = q.size();
            LinkedList<Integer> res = new LinkedList<>();
            order = !order;
            for(int i = 0; i < n; i++){
                TreeNode node = q.poll();
                // res.add(node.val);
                if(order)
                    res.add(node.val); 
                else{
                    res.addFirst(node.val);                    
                }
                if(node.left != null){
                    q.add(node.left);
                }if(node.right != null){
                    q.add(node.right);
                }
            }
            list.add(res);
        }
        return list;
    }
}