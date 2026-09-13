import java.util.Scanner;

public class prime {

/*
Question: Why is checking divisors up to the square root enough for primality tests?
Example: 29 -> prime, 30 -> not prime.
*/
    public static boolean isPrime(int n){
        boolean IsPrime = true;
        for(int i=2; i<=n-1;i++){
            if(n%i == 0 ){
                IsPrime = false;
                break;
            }
        }
        return IsPrime;
    }

    // optimaize version of prime
    public static boolean Isprime(int n){
        if(n <= 1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
  
    public static boolean primehai(int n){
        if(n <= 1){
            return false;
        }
        for(int i=2; i*i <=n;i++){
            if(n %i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println("enter the number to check it is prime or not");
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        // System.out.println(isPrime(n));
        // System.out.println(Isprime(n));
        System.out.println(primehai(n));;
    }
}
