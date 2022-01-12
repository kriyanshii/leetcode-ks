```
int highest=0;
int total=0;
for(int point:gain){
total+=point;
if(total>highest)
highest=total;
}
return highest;
```