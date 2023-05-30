// classic problem on the backtracking and recursion approach

public class Nqueens{
    public static boolean isSafe(char[][] board,int row, int col){
            // vertical up
            for(int i=row-1;i>=0;i--){
                if(board[i][col]=='Q'){
                    return false;
                }
            }
            // diag left
            for(int i=row-1,j=col-1;i>=0 && j>=0; j--,i--){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
            // diag right up 
            for(int i=row-1,j=col+1;i>=0 && j<board.length; j++,i--){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
            return true;
    }

    static int count=0;
    public static void nqueens(char[][] board, int row){
        // base case
        if(row == board.length){
            count++;
            printBoard(board);
            return;
        }
        
        // kaam queen
        // checking all possible solutions for queens in columns
        for(int j=0; j<board.length; j++){
            if(isSafe(board,row,j)){
            board[row][j] = 'Q';
            nqueens(board,row+1);
            // now backtrack 
            board[row][j] = 'X';
            }
        }
    }
    // printing board

    public static void printBoard(char[][] board){
        System.out.println("----------------------chess board-----------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
       int n =4;
       char [][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
               board [i][j]='X'; 
            }
        }
        // set queens in a row
        nqueens(board, 0);
        System.out.println("total ways are:"+count);
    }
}