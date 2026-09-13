import java.util.Scanner;

public class spiral {
    public static void spiralMat(int[][] spiral){
      int startrow =0;
      int startcol = 0;
      int endrow =spiral.length-1;
      int endcol=spiral[0].length-1;
      while(startrow<= endrow && startcol<= endcol){
        //top
        for(int i=startcol;i<=endcol;i++){
               System.out.print(spiral[startrow][i]+" ");
        }
        //right
        for(int j=startrow+1;j<=endrow;j++){
            System.out.print(spiral[j][endcol]+" ");
        }
        //bottom
        for(int i= endcol-1;i>=startcol;i--){
            if(startrow ==endrow) break;
            System.out.print(spiral[endrow][i]+" ");
        }
        //left
        for(int j =endrow-1;j>=startrow+1;j--){
            if(startcol == endcol) break;
            System.out.print(spiral[j][startcol]+" ");
        }
        startcol++;
        startrow++;
        endcol--;
        endrow--;
      }
    }
/*
Question: How does spiral traversal print a 2D matrix layer by layer?
Example: Matrix {{1,2,3},{4,5,6},{7,8,9}} -> 1 2 3 6 9 8 7 4 5.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int spiral[][] = new int[n][m];
        //input
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                spiral[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(spiral[i][j]+" ");
            }
            System.out.println();
        }
        spiralMat(spiral);
    }
}
