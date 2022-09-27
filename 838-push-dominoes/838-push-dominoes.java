class Solution {
    public String pushDominoes(String d) {
        d = 'L' + d + 'R';
        StringBuilder s = new StringBuilder();
        for(int i = 0, j = 1; j < d.length(); j++){
            if(d.charAt(j) == '.') continue;
            int middle = j - i - 1;
            if(i > 0){
                s.append(d.charAt(i));
                // System.out.println(s + " " + i + " " + j);
            }
            if(d.charAt(i) == d.charAt(j)){
                for(int k = 0; k < middle; k++){
                    s.append(d.charAt(i)); 
                    // System.out.println(s + " " + i + " " + j);
                }
            }else if(d.charAt(i) == 'L' && d.charAt(j) == 'R'){
                for(int k = 0; k < middle; k++){
                    s.append('.');
                    // System.out.println(s + " " + i + " " + j);
                }
            }else{
                for(int k = 0; k < middle/2; k++){
                    s.append('R');
                    // System.out.println(s + " " + i + " " + j);
                }if(middle % 2 == 1){
                    s.append('.');
                    // System.out.println(s + " " + i + " " + j);
                }for(int k = 0; k < middle/2; k++){
                    s.append('L');
                    // System.out.println(s + " " + i + " " + j);
                }
            }
            i = j;
        }
        return s.toString();
    }
}