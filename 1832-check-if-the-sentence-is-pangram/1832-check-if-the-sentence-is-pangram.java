class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] alpa = new int[26];
        int len =  sentence.length();
        
        for(int i=0; i<len ;i++){            
            int index = sentence.charAt(i);            
            alpa[index-'a'] = 1;         
                        
        }
        
        for(int j=0; j< alpa.length; j++){
            if(alpa[j] == 0){
                return false;
            }
        }
        return true;
    }
}