public class Rhombus {
/*
Question: How do spaces shift each row to print a solid rhombus?
Example: n=4 -> a slanted block of stars.
*/
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



    *****
   *****
  *****
 *****
*****