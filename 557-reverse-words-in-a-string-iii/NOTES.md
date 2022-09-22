public String reverseWords(String s) {
char[] c = s.toCharArray();
for(int i = 0; i < c.length; i++){
if(c[i] != ' '){
int j = i;
while(j + 1 < c.length && c[j + 1] != ' '){
j++;
}
reverse(c, i, j);
i = j;
}
}
return new String(c);
}
public void reverse(char[] c, int i, int j){
while(i < j){
char tmp = c[i];
c[i] = c[j];
c[j] = tmp;
i++;
j--;
}
}