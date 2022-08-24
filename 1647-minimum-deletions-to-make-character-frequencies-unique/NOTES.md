int[] freq = new int[26];
int count = 0;
for(char c: s.toCharArray()){
freq[c - 'a']++;
}
Set<Integer> set = new HashSet<>();
for(int i = 0; i < 26; i++){
while(freq[i] > 0 && !set.add(freq[i])){
--freq[i];
count++;
}
}
return count;