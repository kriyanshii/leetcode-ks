class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for(int i: pushed){
            // while()
            stack.push(i);
            while(!stack.empty() && stack.peek() == popped[count]){
                stack.pop();
                count++;
            }
            
        }
        return stack.isEmpty();
    }
}