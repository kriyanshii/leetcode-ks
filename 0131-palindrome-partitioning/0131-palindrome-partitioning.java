class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        helper(s, new ArrayList<>(), res);
        return res;
    }
    
    public void helper(String s, List<String> list, List<List<String>> res){
        if(s == null || s.length() ==  0){
            res.add(new ArrayList<>(list));
            return;
        }   
        for(int i=1; i <= s.length(); i++){
            String temp = s.substring(0, i);
            if(!isPallindrome(temp)) continue;
            list.add(temp);
            helper(s.substring(i, s.length()), list, res);
            list.remove(list.size() - 1); 
        }
        return;
    }
    
    public boolean isPallindrome(String s){
        int left = 0, right = s.length() - 1;
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}