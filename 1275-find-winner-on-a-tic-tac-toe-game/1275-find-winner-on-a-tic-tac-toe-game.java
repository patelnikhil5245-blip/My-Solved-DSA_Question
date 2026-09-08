class Solution {
    public String tictactoe(int[][] moves) {

        char[][] board = new char[3][3];

        for(int i = 0; i < moves.length; i++) {

            int row = moves[i][0];
            int col = moves[i][1];

            if(i % 2 == 0) {
                board[row][col] = 'X';
            }
            else {
                board[row][col] = 'O';
            }
        }

        if(win(board, 'X'))
            return "A";

        if(win(board, 'O'))
            return "B";

        if(moves.length == 9)
            return "Draw";

        return "Pending";
    }

    public boolean win(char[][] board, char player) {

        // Rows
        for(int i = 0; i < 3; i++) {
            if(board[i][0] == player &&
               board[i][1] == player &&
               board[i][2] == player) {
                return true;
            }
        }

        // Columns
        for(int i = 0; i < 3; i++) {
            if(board[0][i] == player &&
               board[1][i] == player &&
               board[2][i] == player) {
                return true;
            }
        }

        // Main diagonal
        if(board[0][0] == player &&
           board[1][1] == player &&
           board[2][2] == player) {
            return true;
        }

        // Anti diagonal
        if(board[0][2] == player &&
           board[1][1] == player &&
           board[2][0] == player) {
            return true;
        }

        return false;
    }
}