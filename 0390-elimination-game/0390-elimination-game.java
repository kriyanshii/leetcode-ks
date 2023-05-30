class Solution {
    public int lastRemaining(int n) {
        int remaining = n, head = 1, step = 1;
        boolean left = true;
        while(remaining > 1){
            if(left || remaining % 2 == 1){
                head += step;
            }
            remaining /= 2;
            step *= 2;
            left = !left;
        }
        return head;
    }
}