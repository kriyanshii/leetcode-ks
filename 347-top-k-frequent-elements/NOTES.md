PriorityQueue<Integer> minHeap = new PriorityQueue<>((o1,o2)->map.get(o1)-map.get(o2));
//for each entry in map add it to minHeap
for(Integer key:map.keySet()) {
minHeap.add(key);
//if size reaches k delete top entry.
if(minHeap.size()>k) {
minHeap.poll();
}
}
//prepare output array
int[] op = new int[k];
while(!minHeap.isEmpty()) {
op[--k]=minHeap.poll();
}
return op;