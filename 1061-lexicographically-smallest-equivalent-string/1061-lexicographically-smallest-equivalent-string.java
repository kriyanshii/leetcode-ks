class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int[] graph = new int[26];
        for(int i = 0; i < 26; i++){
            graph[i] = i;
        }
        for(int i = 0; i < s1.length(); i++){
            int b1 = find(graph, s2.charAt(i) - 'a');
            int b2 = find(graph, s1.charAt(i) - 'a');
            if(b1 < b2){
                graph[b2] = b1;
            }else{
                graph[b1] = b2;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < baseStr.length(); i++){
            char c = baseStr.charAt(i);
            sb.append((char)('a' + find(graph, c - 'a')));
        }
        return sb.toString();
    }
    
    public int find(int[] graph, int idx){
        while(graph[idx] != idx){
            idx = graph[idx];
        }
        return idx;
    }
}