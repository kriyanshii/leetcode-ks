class Solution {
    public boolean isPalindrome(String s) {
        if(s==null){
            return false;
        }
 
        s = s.toLowerCase();
        for(int left=0,right=s.length()-1;left<right;left++,right-- ){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left)))left++;

            while(left<right && !Character.isLetterOrDigit(s.charAt(right)))right--;

            if(s.charAt(left)!=s.charAt(right)) return false;
        }
        return true;
    }
}