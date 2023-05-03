List<List<Integer>> ret = new ArrayList();
ret.add(new ArrayList());
ret.add(new ArrayList());
for(int i : s1){
if(!s2.contains(i)){
ret.get(0).add(i);
}
}
for(int i : s2){
if(!s1.contains(i)){
ret.get(1).add(i);
}
}
return ret;