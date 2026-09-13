public class four {
/*
Question: How do edge checks print only the border of a square pattern?
Example: n=4 -> a hollow square of stars.
*/
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

******
*    *
*    *
*    *
*    *
****** 