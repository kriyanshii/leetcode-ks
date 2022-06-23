/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        preOrderHelper(root, list);
        return list;
    }
    
    public void preOrderHelper(Node root, List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        for(int i = 0; i < root.children.size(); i++){
            preOrderHelper(root.children.get(i), list);
        }
    }
}