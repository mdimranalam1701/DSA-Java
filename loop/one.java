public class one{
/*
Question: How do nested loops print an increasing star triangle?
Example: n=3 -> * / ** / ***.
*/
public static void main(String[] args) {
    for(int i=1;i<=4;i++){
     //inner
     for(int j=1;j<=i;j++){
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