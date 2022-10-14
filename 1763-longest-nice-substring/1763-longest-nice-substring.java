class Solution {
    public String longestNiceSubstring(String s) {
        if(s.length() < 2) return "";
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for(char c: arr) set.add(c);
        for(int i = 0; i < arr.length; i++){
            char c = arr[i];
            if(set.contains(Character.toUpperCase(c)) && set.contains(Character.toLowerCase(c))) continue;
            String str1 = longestNiceSubstring(s.substring(0, i));
            String str2 = longestNiceSubstring(s.substring(i + 1));
            return str1.length() >= str2.length() ? str1 : str2;
        }
        return s;
    }
}