 class Solution {
    public boolean strongPasswordCheckerII(String password) {
        Set<Character> seen = new HashSet<>();
        for(int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            if(i > 0 && c == password.charAt(i-1)){
                return false;
            }
            if(Character.isLowerCase(c)){
                seen.add('l');
            }else if(Character.isUpperCase(c)){
                seen.add('u');
            }else if(Character.isDigit(c)){
                seen.add('d');
            }else if("!@#$%^&*()-+".contains(c + "")){
                seen.add('s');
            }
        }
        return password.length() >= 8 && seen.size() == 4;
    }
}