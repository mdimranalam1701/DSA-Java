import java.util.Scanner;

public class factorial {

    public static void factorial(int a){
        int fact =1;
        for(int i=1;i<=a;i++){
            fact *= i;
        }
        System.out.println(fact);
    }
    public static void fact(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        System.out.println(fact);
    }
/*
Question: How does iterative factorial multiply all numbers from 1 to n?
Example: n=5 -> 120.
*/
    public static void main(String[] args) {
        System.out.println("enter the number to get factorial");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        factorial(a);
       
    }
}
