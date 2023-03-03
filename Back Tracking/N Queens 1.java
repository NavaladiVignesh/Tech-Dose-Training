public class N Queens 1
{

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        int[] leftRow = new int[n];
        int[] upperDiagonal = new int[2*n-1];
        int[] lowerDiagonal = new int[2*n-1];
        List<List<String>> list = new ArrayList<>();
        solve(0,board,leftRow,upperDiagonal,lowerDiagonal,list);
        return list;
    }

    public static void solve(int col,char[][] board,int[] leftRow,int[] upperDiagonal,int[] lowerDiagonal,List<List<String>> list){
        if(col==board.length){
            list.add(construct(board));
            return;
        }
        
        for(int row=0;row<board.length;row++){
            
            if(leftRow[row]==0 && upperDiagonal[board.length-1+col-row]==0 && lowerDiagonal[row+col]==0 ){
                board[row][col]='Q';
                leftRow[row]=1;
                upperDiagonal[board.length-1+col-row]=1;
                lowerDiagonal[row+col]=1;
                solve(col+1,board,leftRow,upperDiagonal,lowerDiagonal,list);
                board[row][col]='.';
                leftRow[row]=0;
                upperDiagonal[board.length-1+col-row]=0;
                lowerDiagonal[row+col]=0;
            }
        }
    }

    public static List<String> construct(char[][] board){
        List<String> list = new LinkedList<>();
        for(int i=0;i<board.length;i++){
            String str = new String(board[i]);
            list.add(str);
        }
        return list;
    }
}
