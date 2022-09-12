class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int res = 0, points = 0, i = 0, j = tokens.length - 1;
        Arrays.sort(tokens);
        while(i <= j){
            if(power >= tokens[i]){
                power -= tokens[i++];
                res = Math.max(res, ++points);
            }
            else if(points > 0){
                points--;
                power += tokens[j--];
            }else{
                break;
            }
        }
        return res;
    }
}