class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int ruleno = 0; //ruleKey as type
        if(ruleKey.equals("color")){
            ruleno = 1;
        } 
        if(ruleKey.equals("name")){
            ruleno = 2;
        } 
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(ruleno).equals(ruleValue)) count++;
        }
        return count;
    }
} 