class Solution {
    public boolean canChange(String start, String target) {
        int n = target.length();
        int i = 0, j = 0;
        while(i <= n || j <= n){
            while(i < n && start.charAt(i) == '_'){
                i++;
            }
            while(j < n && target.charAt(j) == '_'){
                j++;
            }
            
            if(i == n || j == n) return i == n && j == n;
            
            if(target.charAt(j) != start.charAt(i)) return false;
            
            if(target.charAt(j) == 'L'){
                if(i < j) return false;
            }else{
                if(j < i) return false;
            }
            i++;
            j++;
        }
        return true;
    }
}