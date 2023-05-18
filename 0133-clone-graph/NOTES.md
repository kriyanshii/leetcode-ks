https://leetcode.com/problems/clone-graph/discuss/1793436/Java-Simple-Code-With-Heavy-Comments-(No-HashMap)
​
visited[copy.val] = copy;
for(Node n: node.neighbors){
if(visited[n.val] == null){
Node newNode = new Node(n.val);
copy.neighbors.add(newNode);
dfs(n, newNode, visited);
}else{
copy.neighbors.add(visited[n.val]);
}
}