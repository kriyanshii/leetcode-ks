class Solution {
    public boolean exist(char[][] board, String word) {
        // System.out.println(board[0][0] ^ 256);
        // return true;
        char[] w = word.toCharArray();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(exist(board, i, j, w, 0)) return true;
            }
        }
        return false;
    }
    
    public boolean exist(char[][] board, int i, int j, char[] word, int x){
        if(x == word.length) return true;
        if(i < 0 || j < 0 || i == board.length || j == board[i].length) return false;
        if(board[i][j] != word[x]) return false;
        board[i][j] ^= 256;
        boolean existed = exist(board, i, j + 1, word, x + 1) || exist(board, i, j - 1, word, x + 1) || exist(board, i + 1, j, word, x + 1) || exist(board, i - 1, j, word, x + 1);
        board[i][j] ^= 256;
        return existed;
    }
}