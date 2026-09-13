/*
Question: How do you find the largest and smallest values in one array scan?
Example: Input 3, 8, 1, 6 -> largest 8 and smallest 1.
*/
import java.util.*;
public class largestnumber {
    public static int largestNumber(int[] num){
        int largestnumber = Integer.MIN_VALUE;
        int smallestNumber =Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i] > largestnumber) {
                largestnumber = num[i];
            }
            if(num[i] < smallestNumber ){
                smallestNumber = num[i];
            }
        }
        System.out.println("smallest values is : "+smallestNumber);
        return largestnumber;
    }
    public static void main(String[] args) {
        int num[] = {1,2,6,3,5};
        System.out.println("largest number will be : "+largestNumber(num));

    }
}
