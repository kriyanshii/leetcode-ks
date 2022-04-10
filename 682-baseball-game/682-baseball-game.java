class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack();
        for(String op: ops){
            // in case of [5,10]
            if(op.equals("+")){
                // top = 10, stack = [5]
                int top = stack.pop();
                // newtop = 10 + 5, stack = [5]
                int newtop = top + stack.peek();
                // stack = 5, 10
                stack.push(top);
                // stack = 5, 10 , 15
                stack.push(newtop);
            }else if(op.equals("C")){
                stack.pop();
            }else if(op.equals("D")){
                stack.push(2 * stack.peek());
            }else{
                stack.push(Integer.valueOf(op));
            }
        }
        int ans = 0;
        for(int score: stack) ans += score;
        return ans;
    }
}