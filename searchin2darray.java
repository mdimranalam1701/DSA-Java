public class searchin2darray {

    public static boolean searchkey(int matrix[][],int key){
        int row =0; 
        int col =matrix[0].length-1;
        while(row<matrix.length && col>0){
            if(matrix[row][col] == key){
                System.out.println("found key at"+row+","+col);
                return true;
            } else if(key<matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
/*
Question: How does searching from the top-right corner help find a target in a sorted 2D matrix?
Example: Matrix {{1,4,7},{2,5,8},{3,6,9}}, key 5 -> found.
*/
    public static void main(String[] args) {
         int matrix[][] = {{1,2,3,4}, 
                          {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
                         int key = 14;

                         searchkey(matrix, key);
    }
}
