public class two {
/*
Question: How do nested loops print a decreasing star triangle?
Example: n=3 -> *** / ** / *.
*/
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            //inner
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

****
***
**
*
