class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int i = len /2; i >= 1; i--){
            if(len % i == 0){
                int m = len/i;
                String sub = s.substring(0, i);
                int j;
                for(j = 1; j < m; j++){
                    if(!sub.equals(s.substring(j * i, i+j*i))) break;
                }
                if(j == m){
                    return true;
                }
            }
        }
        return false;
    }
}