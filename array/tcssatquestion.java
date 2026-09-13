import java.util.*;

public class tcssatquestion {
/*
Question: How do you factorize a number by removing 2s first and then testing odd divisors?
Example: 60 -> factors 2, 2, 3, 5.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //2 factor haddling
        while(n % 2 == 0){
            System.out.print(2+" ");
            n = n/2;
        }

        for(int i=3;i*i<=n;i+=2){
            while(n % i == 0){
                System.out.print(i+" ");
                n /=i;
            }
        }
        if(n>1){
            System.out.println(n);
        }
    }
}