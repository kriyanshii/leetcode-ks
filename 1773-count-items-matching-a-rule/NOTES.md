int ruleNo = 0;  // for the ruleKey as a "type"
if(ruleKey.equals("color")){
ruleNo = 1;
}
if(ruleKey.equals("name")){
ruleNo = 2;
}
for(int i = 0; i < items.size(); i++) {
if(items.get(i).get(ruleNo).equals(ruleValue)) {
count++;
}
}
return count;