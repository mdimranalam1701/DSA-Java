public class nnqueen {

/*
Question: How does the N-Queens backtracking solution check whether a queen placement is safe?
Example: Place queens on a board so none attack each other in rows, columns, or diagonals.
*/
    static int count = 0;
    public static void  printBoard (char board[][]){
        System.out.println("------border chess -------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }
    
    /// is safe function to check placeing q is safe or not

    public static boolean isSafe(char board[][],int row,int col){
        //for vertical only row will change row-1
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //left check 
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //right row will dec and col will incerecse
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    

    public static boolean nqueen(char board[][],int row){
        //base case
        if(row == board.length){
            // printBoard(board);
            count++;
            return true;
        }
        //clo 

        for(int i=0;i<board.length;i++){
            if(isSafe(board, row, i)){
               board[row][i] = 'Q';
               //function call
               if(nqueen(board, row+1)){
                return true;
               }
               board[row][i] = 'X'; // Back track
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int n=4;
        char board[][] = new char[n][n];

        //initilize
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j] = 'X';
            }
        }

        nqueen(board, 0);
        // System.out.println("total possible solution "+count);

        if(nqueen(board, 0)){
            System.out.println("solution possible");
            System.out.println("total possible solution "+count);
            printBoard(board);
        }else{
            System.out.println("solution not possible");
        }

    }
}

// output
// solution possible
// total possible solution 2
// ------border chess -------
// XQXX
// XXXQ
// QXXX
// XXQX
// ---------------------------
