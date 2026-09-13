/*
Question: How do you calculate the sum of an arithmetic progression using the first term, common difference, and number of terms?
Example: Input a=2, d=3, n=4 -> output 26.
*/
import java.util.*;
public class apsum {
    public static int sumofAP(int a,int d,int n){
        return (n*(2*a+(n-1)*d))/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first term a");
        int a = sc.nextInt();
        System.out.println("enter the common difference d");
        int d = sc.nextInt();
        System.out.println("enter number of terms n");
        int n = sc.nextInt();
            int sum = sumofAP(a,d,n);
            System.out.println(sum);
            sc.close();
    }
}
