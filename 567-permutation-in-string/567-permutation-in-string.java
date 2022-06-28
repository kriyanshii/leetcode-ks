class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        int[] count = new int[26];
        if(len1 > len2) return false;
        for(int i = 0; i < len1; i++){
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;     
        }
        if(checkZeros(count)) return true;
        for(int i = len1; i < len2; i++){
            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i - len1) - 'a']++;
            if(checkZeros(count)) return true;
        }
        return false;
    }
    
    public boolean checkZeros(int[] count){
        for(int i = 0; i < count.length; i++){
            if(count[i] != 0) return false;
        }
        return true;
    }
}