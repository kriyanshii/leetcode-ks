int key = i-j;
if(hmp.containsKey(key)){
if(hmp.get(key) != matrix[i][j]){
return false;
}
}else{
hmp.put(key, matrix[i][j]);
}