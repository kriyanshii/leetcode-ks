class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    
    public String build(String S){
        Stack<Character> s = new Stack<>();
        for(char c: S.toCharArray()){
            if(c != '#'){
                s.push(c);
            }else if(!s.empty()){
                s.pop();
            }
        }
        return String.valueOf(s);
    }
}