public class Word Search 1
{

    public boolean exist(char[][] board, String word) {
        char[] Word = word.toCharArray();
        int r=board.length;
        int c=board[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                    if(isFind(board,Word,i,j,0))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isFind(char[][] board, char[] word, int i, int j, int index) {
        if (index == word.length) {
            return true;
        }
        if (i < 0 || j < 0 || i == board.length || j == board[i].length) {
            return false;
        }
        if (board[i][j] != word[index]) {
            return false;
        }
        board[i][j] ^= 128;// visited char so chage into another value using xor
        boolean isValid = isFind(board, word, i - 1, j, index + 1) || isFind(board, word, i + 1, j, index + 1)
                || isFind(board, word, i, j - 1, index + 1) || isFind(board, word, i, j + 1, index + 1);

        board[i][j] ^= 128;// after backtracing we have to rearrange the chage char into previous one
        return isValid;
    }
}
