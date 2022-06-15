class Solution {
    public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");
        String rev = "";
        for(int i = parts.length - 1; i >= 1; i--){
            rev += parts[i] + " ";
        }
        return rev + parts[0];
    }
}