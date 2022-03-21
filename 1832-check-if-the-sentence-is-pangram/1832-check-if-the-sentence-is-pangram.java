class Solution {
    public boolean checkIfPangram(String sentence) {
        int alpa[] = new int[26];
        int n = sentence.length();
        for(int i=0; i<n;i++){
            char s = sentence.charAt(i);
            alpa[s - 'a'] = 1;
        }
        for(int i=0; i<26; i++){
            if(alpa[i] == 0){
                return false;
            }
        }
        return true;
    }
}