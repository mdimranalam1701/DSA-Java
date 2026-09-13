public class three {
/*
Question: How do spaces and stars combine to make a right-aligned triangle?
Example: n=3 -> "  *", " **", "***".
*/
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //start
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
   *
  **
 ***
****