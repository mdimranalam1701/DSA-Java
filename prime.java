import java.util.Scanner;

public class prime{

/*
Question: How do you test whether a number is prime by checking divisors up to its square root?
Example: 29 -> prime, 30 -> not prime.
*/
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       boolean isprime = true;
       if(n <=1){
        isprime =false;
       }
       for(int i=2;i*i<n;i++){
        if(n%i == 0){
             isprime = false;
             break;
        }
       }
       if(isprime == true){
        System.out.println("numsber is prime");
       }else{
        System.out.println("number is not prime");
       }
    }
}