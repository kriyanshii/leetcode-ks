class Solution {
    public int maxLength(List<String> arr) {
        List<String> res = new ArrayList<>();
        res.add("");
        for(String str: arr){
            if(!isUnique(str)) continue;
            List<String> relist = new ArrayList<>();
            for(String s: res){
                String tmp = s + str;
                if(isUnique(tmp)) relist.add(tmp);
            }
            res.addAll(relist);
        }
        int ans = 0;
        for(String str: res){
            ans = Math.max(ans, str.length());
        }
        return ans;
    }
    
    public boolean isUnique(String str){
        if(str.length() > 26) return false;
        boolean[] used =  new boolean[26];
        for(char c: str.toCharArray()){
            if(used[c - 'a']) return false;
            else used[c - 'a'] = true;
        }
        return true;
    }
}