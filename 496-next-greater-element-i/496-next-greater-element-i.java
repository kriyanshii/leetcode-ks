class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        // the array which will store the greatest right elemetns
        int[] ans = new int[n1];
        
        //to store greatest right element
        Stack<Integer> stack = new Stack<>();
        //to store particuler greatest right element
        HashMap<Integer, Integer> greatestRight = new HashMap<>();
        for(int i=n2 -1; i>=0; i--){
            //while stack is not empty and the top is less than nums[i] then pop.
            while(!stack.isEmpty() && stack.peek() < nums2[i]){
                stack.pop();
            }
            //if stack is not empty then store the greates element else store -1
            greatestRight.put(nums2[i], stack.isEmpty() ? -1 : stack.peek());
            
            //push the current element into the stack
            stack.push(nums2[i]);
        }
        
        for(int i=0; i<n1;i++){
            ans[i] = greatestRight.get(nums1[i]);
        }
        return ans;
    }
}