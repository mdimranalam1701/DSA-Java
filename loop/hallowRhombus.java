public class hallowRhombus {
/*
Question: How do spacing and border checks create a hollow rhombus pattern?
Example: n=4 -> a slanted hollow diamond-like shape.
*/
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //start
            for(int k=1;k<=n;k++){
            if(k==1 || k == n || i==1 || i == n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }
}

    *****
   *   *
  *   *
 *   *
*****
