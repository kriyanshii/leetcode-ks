https://leetcode.com/problems/combinations/discuss/27002/Backtracking-Solution-Java
```
if(k == 0){
list.add(new ArrayList<>(tmp));
}else{
for(int i = start; i <= n; i++){
tmp.add(i);
comb(list, tmp, i + 1, n, k - 1);
tmp.remove(tmp.size() - 1);
}
}
```