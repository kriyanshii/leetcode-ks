PriorityQueue<Integer> hp = new PriorityQueue<>((o1, o2) -> map.get(o1) - map.get(o2));
for(int key: map.keySet()){
hp.add(key);
if(hp.size() > k){
hp.poll();
}
}
int[] res = new int[k];
while(!hp.isEmpty()){
res[--k] = hp.poll();
}
return res;