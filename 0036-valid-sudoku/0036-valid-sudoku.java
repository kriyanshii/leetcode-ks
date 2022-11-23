class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set seen = new HashSet<>();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j  < board[0].length; j++){
                char num = board[i][j];
                if(num != '.'){
                    if(!seen.add(num + "row" + i) || !seen.add(num + "col" + j) || !seen.add(num + "block" + i/3 + "-" + j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}