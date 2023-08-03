class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        List<String> l1 = new ArrayList<>();
        solve("", digits, l1);
        return l1;
    }
    
    public void solve(String p, String up, List<String> l1){
        if(up.isEmpty()){
            l1.add(p);
            return;
        }
        //compute start and end
        int number = up.charAt(0) - '0';
        //start
        char start = '0';
        char end = '0';
        if(number == 8 || number == 9){
            start = (char)(((number - 1) *3 -2) + 'a');
        }else{
            start = (char)(((number - 1) *3 - 3) + 'a');
        }if(number == 7 || number == 9){
            end = (char)(start + 4);
        }else{
            end = (char)(start + 3);
        }
        //calling for all the 
        for(char i = start; i<end; i++){
            solve(p+i, up.substring(1), l1);
        }
    }
}