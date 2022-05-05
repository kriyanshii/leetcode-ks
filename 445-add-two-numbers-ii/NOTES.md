https://leetcode.com/problems/add-two-numbers-ii/discuss/1985295/Java-easy-solution-using-Add-Two-Numbers
//temp node
list.val = sum%10;
ListNode head = new ListNode(sum / 10);
head.next = list;
list = head;
//carry
sum /= 10;
​
here list is the pointer variable to the head.
here what happens is that
for 7, 2, 4, 3
5, 6, 4
the stack will be:
s1    s2
3      5
4      6
2      4
7
​
now for 3 and 5
sum = 8
and list.value = 8 % 10 = 8;
now,
* `ListNode head = new ListNode(sum /10) = 0;`
here new head is initialized with the value of 0;
and,
* `head.next = list`
so head will point to 8
​
* `list = head;`
And, list will point to head.
​
* `sum = sum/10 = 0;`
this is to store carry
​