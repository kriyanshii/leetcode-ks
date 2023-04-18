class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i;
        for(i = 0; i < (word1.length() < word2.length() ? word1.length() : word2.length()); i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        while(i < word1.length()){
            sb.append(word1.charAt(i));
            i++;
        }
        while(i < word2.length()){
            sb.append(word2.charAt(i));
            i++;
        }
        return sb.toString();
    }
}