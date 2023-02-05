}
for(int i = lenP; i < lenS; i++){
currCount[s.charAt(i - lenP) - 'a']--;
currCount[s.charAt(i) - 'a']++;
if(areSame(currCount, count)){
list.add(i - lenP + 1);
}
}
return list;
}
public boolean areSame(int[] x, int[] y){
for(int i = 0; i < 26; i++){
if(x[i] != y[i]){
return false;
}
}
return true;
}
public int[] freq(String s){
int[] count = new int[26];
for(char c: s.toCharArray()){
count[c - 'a']++;
}
return count;
}
​
https://leetcode.com/problems/find-all-anagrams-in-a-string/discuss/1738052/A-very-deep-EXPLANATION-oror-Solved-without-using-HashTable
Similar
Valid Anagram
Easy
Permutation in String
Medium
​
cbaebabacd
​