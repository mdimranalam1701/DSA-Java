/*
Question: How does the monkey allocation logic divide bananas and peanuts among monkeys?
Example: Check the computed count using the given resource values.
*/
import java.util.*;
public class monkey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k = sc.nextInt();// no of banana can be eat by one monkey
        int j = sc.nextInt();//no of peanut can be eated by monkey
        int m = sc.nextInt(); //total bana 
        int p = sc.nextInt(); //total peanuts
        sc.close();
        //monkey can eat eaither peanusts or banana
        int banana_etaed = m/k;
        int banana_remains = m%k;
        int peanuts_eated = p/j;
        int peanuts_remains = p%j;
        int monkey_left = n-(banana_etaed+peanuts_eated);

        if(banana_remains != 0 || peanuts_remains != 0){
            monkey_left--;
        }
        System.out.println(monkey_left);
    }
}
