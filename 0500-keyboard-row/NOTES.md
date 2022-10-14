List<String> list = new ArrayList<>();
for(String a: words){
String s = a.toLowerCase();
boolean isValid = true;
int row = rows[s.charAt(0)-'a'];
for(int i=1; i<s.length();i++){
if(rows[s.charAt(i)-'a']!=row){
isValid = false;
break;
}
}
if(isValid){
list.add(a);
}
}
return list.toArray(new String[0]);