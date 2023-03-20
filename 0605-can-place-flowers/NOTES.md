while(i < flowerbed.length){
if(flowerbed[i] == 0 && (i == 0 || flowerbed[i -1] == 0) &&(i == flowerbed.length -1 || flowerbed[i+1] == 0)){
flowerbed[i] += 1;
emptyBed++;
}
if(emptyBed >= n){
return true;
}
i++;
}
return false;