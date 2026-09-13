/*
Question: What rules determine whether a year is a leap year in the Gregorian calendar?
Example: 2000 -> leap year, 1900 -> not a leap year.
*/
import java.util.Scanner;
import java.util.Scanner;

public class leapyear {
    static boolean leapyearis(int year){
        if(year % 400 == 0) return true;
        if(year % 100 == 0) return false;
        return year%4 ==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(leapyearis(year)){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }

    }
}
