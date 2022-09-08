class Solution {
    public String multiply(String num1, String num2) {
        int[] res = new int[num1.length() + num2.length()];
        for(int i = num1.length() - 1; i >= 0; i--){
            int carry = 0;
            for(int j = num2.length() - 1; j >= 0; j--){
                res[i + j + 1] += carry + (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                carry = res[i + j + 1] / 10;
                res[i + j + 1] %= 10;
            }
            res[i] = carry;
        }
        
        int i = 0;
        while(i < res.length && res[i] == 0) i++;
        if(i >= res.length) return "0";
        StringBuilder sb = new StringBuilder();
        for(int j = i; j < res.length; j++){
            sb.append(res[j]);
        }
        
        return sb.toString();
    }
}