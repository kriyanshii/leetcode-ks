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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        
        if(root == null) return list;
        
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int len = que.size();
            List<Integer> curLev = new ArrayList<>();
            for(int i = 0; i < len; i++){
                Node curr = que.poll();
                curLev.add(curr.val);
                for(Node n: curr.children){
                    que.offer(n);
                }
            }
            list.add(curLev);
        }
        return list;
    }
}