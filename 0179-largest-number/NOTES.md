public String largestNumber(int[] nums) {
// 1.Convert to Integer array since Arrays.sort(A,T) forces that
String[] strs = new String[nums.length];
for (int i = 0; i < nums.length; i++) {
strs[i] = String.valueOf(nums[i]);
}
​
// 2.Sort in descending order
Arrays.sort(strs, (s1, s2) -> ((s2 + s1).compareTo(s1 + s2)));
​
// 3.Append together and check final result
String result = String.join("", strs);
if (result.isEmpty() || result.charAt(0) == '0') {
return "0";
}
return result;
}