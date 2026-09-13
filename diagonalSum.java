public class diagonalSum {

    public static int diagonalSum(int matrix[][]){
        int endrow =matrix.length-1;
        int endcol = matrix[0].length-1;
        int sum=0;
        // for(int i=0;i<=endrow;i++){ brute force approace 0(n^2)
        //     for(int j=0;j<=endcol;j++){
        //         if(i == j){
        //             sum += matrix[i][j];
        //         } else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        //optimal 

        for(int i=0;i<matrix.length;i++){
            sum += matrix[i][i];
            if(i!= matrix.length-i-1){
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }

/*
Question: How do you calculate the sum of both diagonals in a square matrix without double-counting the center?
Example: 3x3 matrix {{1,2,3},{4,5,6},{7,8,9}} -> output 25.
*/
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4}, 
                          {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};

            System.out.println(diagonalSum(matrix));
    }
}
