public class Sudoku Solver
{

    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0)
            return;

        solve(board);
    }

    public static boolean solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {

                        if (isValid(i, j, c, board)) {
                            board[i][j] = c;

                            if (solve(board))
                                return true;
                            else
                                board[i][j] = '.';

                        }
                    }

                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValid(int row, int col, char c, char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == c)
                return false; // Column

            if (board[row][i] == c)
                return false; // Row

            if (board[3 * (row / 3) + (i / 3)][3 * (col / 3) + (i % 3)] == c) {
                return false;
            }
        }
        return true;
    }
}
