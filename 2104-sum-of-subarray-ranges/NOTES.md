//elliminate the similar one's.
​
​
​
For mere Mortals, Let me explain what exactly is happening in this code.
As Lee has explained in his O(n) solution, f(i) denotes no. of subarray that has A[i] as minimum. (This is missing from his explanation)Similarly, there is another f'(i) which denotes the no. of subarray that has A[i] as maximum
Now Instead of summing the difference b/w maximum and minimum for each subarray, we can just find the difference b/w summation of Maximum in every subarray and summation of minimum in every subarray
​
![](http://assets.leetcode.com/users/images/5bcc2db6-4e75-458f-a86d-6c3cb3414d36_1639320294.8410792.gif)
​
![](http://assets.leetcode.com/users/images/4eeb59b8-937d-4f80-9b52-bc2838d11494_1639320519.0660155.gif)
​
![](http://assets.leetcode.com/users/images/b81862fc-2464-469f-b8a0-7268c238cc90_1639320524.1554918.gif)
​
In Implementation, Lee used another trick. Instead of doing a double pass to find the right and left boundary for the current element. he calculate it only when an element is popped, when this happens we already have left and right boundary for the popped element. This is Masterpiece
​
​