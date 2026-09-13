public class butterfly {
/*
Question: How do two mirrored star triangles create the butterfly pattern?
Example: n=3 -> upper and lower wings around a center gap.
*/
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }

            //start
            for(int z=1;z<=i;z++){
                System.out.print("*");
            }
            System.err.println();
        }
        for(int i=n;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }

            //start
            for(int z=1;z<=i;z++){
                System.out.print("*");
            }
            System.err.println();
        }
    }
}
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *