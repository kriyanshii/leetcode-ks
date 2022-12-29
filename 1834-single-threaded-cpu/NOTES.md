while(ansIdx < n){
while(taskIdx < n && arr[taskIdx].enqueueTime <= curTime){
p.offer(arr[taskIdx++]);
}
if(p.isEmpty()){
curTime = arr[taskIdx].enqueueTime;
}else{
curTime += p.peek().processingTime;
ans[ansIdx++] = p.poll().idx;
}
}
return ans;