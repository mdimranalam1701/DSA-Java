public class sudoku {
    public static boolean isSafe(int [][] sudoku,int row,int col,int digit){
    /*
    Question: How does recursive Sudoku solving validate rows, columns, and 3x3 boxes?
    Example: Fill empty cells so every row, column, and box contains 1 through 9.
    */
         //colum
         for(int i=0;i<=8;i++){
            if(sudoku[i][col] == digit){
                    return false;
                }
              }

         //row

         for(int j=0;j<=8;j++){
            if(sudoku[row][j] == digit){
                return false;
            }
         }

         //grid
         int startrow = (row/3)*3;
         int startcol =(col/3)*3;
         for(int i=startrow ; i<startrow+3;i++){
            for(int j=startcol; j<startcol+3;j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
         }
         return true;
    }

    public static boolean  sudokuSolver(int[][] sudoku,int row,int col ){
        //base case
        if(row == 9){
            return true;
        }

        //recursion
        int nextRow = row,nextCol =col+1;
        if(col+1 == 9){
            nextRow = row+1;
            nextCol =0;
        }

        if(sudoku[row][col] != 0){ //zero is not present then call of next level
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){ //mean solution exits
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }
    public static void printSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j =0; j<9;j++){
                System.out.print(sudoku[i][j]+",");
            }
            System.out.println( );
        }
    }
    public static void main(String[] args) {
        int sudoku[][] = {
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if(sudokuSolver(sudoku,0,0)){
            System.out.println("solution xits");
            printSudoku(sudoku);
        }else{
            System.out.println("sol not exits");
        }
    }
}


// solution xits
// 3,1,6,5,7,8,4,9,2,
// 5,2,9,1,3,4,7,6,8,
// 4,8,7,6,2,9,5,3,1,
// 2,6,3,4,1,5,9,8,7,
// 9,7,4,8,6,3,1,2,5,
// 8,5,1,7,9,2,6,4,3,
// 1,3,8,9,4,7,2,5,6,
// 6,9,2,3,5,1,8,7,4,
// 7,4,5,2,8,6,3,1,9,