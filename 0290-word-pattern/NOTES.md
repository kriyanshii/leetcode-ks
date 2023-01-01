https://leetcode.com/problems/word-pattern/discuss/73399/Very-fast-(3ms)-Java-Solution-using-HashMap
​
String[] arr = s.split(" ");
HashMap <Character, String> map = new HashMap<>();
if(arr.length != pattern.length())  return false;
for(int i = 0; i < pattern.length(); i++){
char c = pattern.charAt(i);
if(map.containsKey(c)){
if(!map.get(c).equals(arr[i])) return false;
}else{
if(!map.containsValue(arr[i])){
map.put(c, arr[i]);
}else{
return false;
}
}
}
return true;