class Solution {
    public String breakPalindrome(String palindrome) {
        char[] pal = palindrome.toCharArray();
        for(int i = 0; i < pal.length/2; i++){
            if(pal[i] != 'a'){
                pal[i] = 'a';
                return String.valueOf(pal);
            }
        }
        
        //every ele is a
        pal[pal.length - 1] = 'b';
        return pal.length < 2 ? "" : String.valueOf(pal);
    }
}